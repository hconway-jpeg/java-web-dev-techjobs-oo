package org.launchcode.techjobs_oo;

public abstract class JobField {
    //shared fields
    private int id;
    private static int nextId = 1;
    private String value;

    //shared constructors
    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }

    //shared custom methods
    public String toString() {
        return value;
    }

    //shared getters and setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String aValue) {
        this.value = aValue;
    }

}
