
package com.jdbmodel.dao;

import java.util.HashMap;
import java.util.Map;

public class Table {
    
    public class Field {
        private String name;
        private boolean nullable;
        private String defvalue;
        private Integer decimal;
        private Integer fractional;
        private Constraint.Type key;
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isNullable() {
            return nullable;
        }

        public void setNullable(boolean nullable) {
            this.nullable = nullable;
        }

        public String getDefvalue() {
            return defvalue;
        }

        public void setDefvalue(String defvalue) {
            this.defvalue = defvalue;
        }

        public Integer getDecimal() {
            return decimal;
        }

        public void setDecimal(Integer decimal) {
            this.decimal = decimal;
        }

        public Integer getFractional() {
            return fractional;
        }

        public void setFractional(Integer fractional) {
            this.fractional = fractional;
        }

        public Constraint.Type getKey() {
            return key;
        }

        public void setKey(Constraint.Type key) {
            this.key = key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    
    private String name;
    private Map<String, Field> fields = new HashMap<>();
    private Map<String, Constraint> constraints = new HashMap<>();
    
    public void addField(Field f) {
        fields.put(f.getName(), f);
    }
    
    public void addConstraint(Constraint c) {
        constraints.put(c.getName(), c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Field> getFields() {
        return fields;
    }

    public void setFields(Map<String, Field> fields) {
        this.fields = fields;
    }

    public Map<String, Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(Map<String, Constraint> constraints) {
        this.constraints = constraints;
    }
}
