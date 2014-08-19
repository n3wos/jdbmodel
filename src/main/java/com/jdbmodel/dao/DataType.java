package com.jdbmodel.dao;

public class DataType {
    public class Size {
        private Integer decimal;
        private Integer fractional;

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
    }
    
    private String name;
    private Size size;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
