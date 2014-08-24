package com.jdbmodel.dao;

import java.util.ArrayList;
import java.util.List;

public class Schema {
    private String name;
    private List<Sequence> sequences = new ArrayList<>(1);
    private List<Table> tables = new ArrayList<>(1);
    private List<Constraint> constraints = new ArrayList<>(1);
    
    public Schema() { }
    
    public Schema(String name) {
        this.name = name;
    }

    public List<Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
    
    public void addTable(Table t) {
        this.tables.add(t);
    }
    
    public void addSequence(Sequence s) {
        this.sequences.add(s);
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
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
}
