package org.launchcode.techjobs_oo;

import java.util.Objects;

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    public int hashCode() {
        return Objects.hash(getId());
    }


    //shared getters and setters
    public int getId() {
        return id;
    }

    public String getValue() {
        if (value.equals("")) {
            return "Data not available";
        } else {
            return value;
        }
    }

    public void setValue(String aValue) {
        this.value = aValue;
    }
}
