package com.jdbmodel.dao;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import com.jdbmodel.dao.Table.Field;

public class Constraint {
      
    public enum Type {
        NONE,
        PK,
        FK,
        INDEX,
        UNIQUE,
    };
    
    private Table table;
    private Type type;
    private List<Field> fields = new ArrayList<>(1);
    private List<Reference> references = new ArrayList<>(1);

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
    
    public void addField(Field f) {
        fields.add(f);
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }
    
    public void addReference(Reference ref) {
        references.add(ref);
    }
}
