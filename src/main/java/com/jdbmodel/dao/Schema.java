package com.jdbmodel.dao;

import java.util.ArrayList;
import java.util.List;

public class Schema {
    
    private List<Sequence> sequences = new ArrayList<Sequence>(1);
    private List<Table> tables = new ArrayList<Table>(1);
    private List<Constraint> constraints = new ArrayList<Constraint>(1);

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
        getTables().add(t);
    }
    
    public void addSequence(Sequence s) {
        getSequences().add(s);
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
}
