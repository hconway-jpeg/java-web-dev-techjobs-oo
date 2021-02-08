package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {

//    public PositionType() {
//        this.id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String aValue) {
//        this();
//        this.value = aValue;
//    }

    //Custom methods
//    @Override
//    public String toString() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

}
