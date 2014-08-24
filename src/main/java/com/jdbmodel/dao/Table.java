
package com.jdbmodel.dao;

import java.util.ArrayList;
import java.util.List;

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
    private List<Field> fields = new ArrayList<>(1);
    private List<Constraint> constraints = new ArrayList<>(1);
    
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
