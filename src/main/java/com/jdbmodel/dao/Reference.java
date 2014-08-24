
package com.jdbmodel.dao;

import java.util.ArrayList;
import java.util.List;
import com.jdbmodel.dao.Table.Field;

public class Reference {
    private Table table;
    private List<Field> fields = new ArrayList<>(1);

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
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
}
