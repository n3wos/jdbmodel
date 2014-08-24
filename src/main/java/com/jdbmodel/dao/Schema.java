package com.jdbmodel.dao;

import java.util.HashMap;
import java.util.Map;

public class Schema {
    private String name;
    private Map<String, Sequence> sequences = new HashMap<>();
    private Map<String, Table> tables = new HashMap<>();
    private Map<String, Constraint> constraints = new HashMap<>();
    
    public Schema() { }
    
    public Schema(String name) {
        this.name = name;
    }

    public Map<String, Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(Map<String, Sequence> sequences) {
        this.sequences = sequences;
    }

    public Map<String, Table> getTables() {
        return tables;
    }

    public void setTables(Map<String, Table> tables) {
        this.tables = tables;
    }
    
    public void addTable(Table t) {
        this.tables.put(t.getName(), t);
    }
    
    public void addSequence(Sequence s) {
        this.sequences.put(s.getName(), s);
    }

    public Map<String, Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(Map<String, Constraint> constraints) {
        this.constraints = constraints;
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
}
