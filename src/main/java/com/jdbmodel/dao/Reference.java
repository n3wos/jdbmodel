
package com.jdbmodel.dao;

import com.jdbmodel.dao.Table.Field;
import java.util.HashMap;
import java.util.Map;

public class Reference {
    private Table table;
    private Map<String, Field> fields = new HashMap<>();

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Map<String, Field> getFields() {
        return fields;
    }

    public void setFields(Map<String, Field> fields) {
        this.fields = fields;
    }
    
    public void addField(Field f) {
        fields.put(f.getName(), f);
    }
}
