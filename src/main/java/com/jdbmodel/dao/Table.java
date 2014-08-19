
package com.jdbmodel.dao;

import java.util.ArrayList;
import java.util.List;

public class Table {
    
    public class Field {
        private String name;
        private DataType dataType;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DataType getDataType() {
            return dataType;
        }

        public void setDataType(DataType dataType) {
            this.dataType = dataType;
        }
    }
    
    private String name;
    private List<Field> fields = new ArrayList<Field>(1);
    private List<Constraint> constraints = new ArrayList<Constraint>(1);
    
    public void addField(Field f) {
        fields.add(f);
    }
    
    public void addConstraint(Constraint c) {
        constraints.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
}
