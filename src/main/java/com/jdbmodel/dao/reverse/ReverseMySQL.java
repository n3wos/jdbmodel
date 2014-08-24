
package com.jdbmodel.dao.reverse;

import com.jdbmodel.dao.Constraint;
import com.jdbmodel.dao.DbProfile;
import com.jdbmodel.dao.Reference;
import com.jdbmodel.dao.Schema;
import com.jdbmodel.dao.Table;
import com.jdbmodel.dao.Table.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.crypto.spec.PSource;

public class ReverseMySQL {
    

    
    public static Schema reverse(DbProfile profile) throws SQLException {
        Statement statement = null;
        ResultSet rs = null;
    
        // setup the connection with the DB.
        Connection connection = profile.getConnection();

        statement = connection.createStatement();
        
        Schema schema = new Schema(profile.getParameter());

        // list tables
        rs = statement.executeQuery("show tables");
        while (rs.next()) {
            Table t = new Table();
            t.setName(rs.getString(1).toUpperCase());
            schema.addTable(t);
            System.out.println("Table " + t.getName() + " added");
        }

        // gather info for each table
        for (Table t: schema.getTables().values()) {
            rs = statement.executeQuery("describe `" + t.getName() + "`");
            System.out.println("Table "+t.getName() + " {");
            
            while (rs.next()) {
                //pase fields: Field 	Type 	Null 	Key 	Default 	Extra
                String field = rs.getString("FIELD");
                String type = rs.getString("TYPE");
                boolean isNull = rs.getBoolean("NULL");
                String key = rs.getString("KEY");
                String def = rs.getString("DEFAULT");
                System.out.println("\t"+field + " " + type + " " + isNull + " " + key + " " + def);

                Field f = t. new Field();
                f.setName(field.toUpperCase());
                f.setNullable(isNull);
                f.setDefvalue(def);

                // field type parsing
                type = type.toUpperCase();
                int pos = type.indexOf("(");

                if (pos != -1) {
                    f.setType(type.substring(0, pos));
                    // now parse size
                    String sz = type.substring(pos+1).trim();

                    // remove )
                    pos = sz.indexOf(")");
                    if (pos != -1) {
                        sz = sz.substring(0, pos).trim();
                    }

                    pos = sz.indexOf(",");
                    if (pos != -1) {
                        // has decimal and fractional parts
                        String dec = sz.substring(0, pos);
                        String fract = sz.substring(pos+1);
                        try {
                            f.setDecimal(Integer.parseInt(dec));
                            f.setFractional(Integer.parseInt(fract));
                        } catch(NumberFormatException e) {
                            System.out.println("Unable to parse field = " + field + " type size: " + type);
                            e.printStackTrace();
                        }
                    } else {
                        // has only decimal part
                        try {
                            f.setDecimal(Integer.parseInt(sz));
                        } catch(NumberFormatException e) {
                            System.out.println("Unable to parse field = " + field + " type size: " + type);
                            e.printStackTrace();
                        }
                    }
                } else {
                    f.setType(type);
                }

                // key type parsing
                key = key.toUpperCase();
                if (key.equals("PRI")) {
                    f.setKey(Constraint.Type.PK);
                } else if (key.equals("UNI")) {
                    f.setKey(Constraint.Type.UNIQUE);
                } else if (key.equals("MUL")) {
                    f.setKey(Constraint.Type.INDEX);
                } else if (key.isEmpty()) {
                    f.setKey(Constraint.Type.NONE);
                } else {
                    throw new SQLException("Unknown key type: " + key);
                }
                t.addField(f);
            }
            System.out.println("}\n");
        }
        
        // constraints
        for (Table t: schema.getTables().values()) {
            System.out.println("Table "+t.getName() + " {");
            rs = statement.executeQuery(
                    "select COLUMN_NAME, CONSTRAINT_NAME, REFERENCED_COLUMN_NAME, REFERENCED_TABLE_NAME " + 
                    "from information_schema.KEY_COLUMN_USAGE where TABLE_NAME = \"" + t.getName() + "\""); //TODO: use parameter binding
            
            while (rs.next()) {
                String field = rs.getString("COLUMN_NAME");
                String cname = rs.getString("CONSTRAINT_NAME");
                String refTable = rs.getString("REFERENCED_TABLE_NAME");
                String refColumn = rs.getString("REFERENCED_COLUMN_NAME");
                
                if (refTable == null || refColumn == null) {
                    System.out.println("\tConstraint " + cname + " - not FK, skipped");
                    continue;
                } else {
                    System.out.println("\tConstraint " + cname + " - OK");
                }
                
                cname = cname.toUpperCase();
                refTable = refTable.toUpperCase();
                refColumn = refColumn.toUpperCase();
                
                Constraint c = new Constraint();
                {
                    c.setName(cname);
                    c.setType(Constraint.Type.FK);
                    c.setTable(t);
                    c.addField(t.getFields().get(field));

                    Reference ref = new Reference();
                    {
                        Table tRef = schema.getTables().get(refTable);
                        ref.setTable(tRef);
                        ref.addField(tRef.getFields().get(refColumn));
                    }
                    c.addReference(null);
                }
                t.addConstraint(c);
                
                schema.addConstraint(c); // global list
            }
            System.out.println("}\n");
        }

        return schema;
    }
}
