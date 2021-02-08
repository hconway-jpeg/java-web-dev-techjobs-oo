package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field. **DONE**

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = anEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public String toString() {
//        // if field == "", then "field: Data not available";
//        return "\n" + "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "Employer: " + employer.getValue() + "\n" + "Location: " + location.getValue() + "\n" + "Position Type: " + positionType.getValue() + "\n" + "Core Competency: " + coreCompetency.getValue() + "\n";
//    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id. **DONE**


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    public void setName(String aName) {
        this.name = aName;
    }


    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer anEmployer) {
        this.employer = anEmployer;
    }


    public Location getLocation() {
        return location;
    }
    public void setLocation(Location aLocation) {
        this.location = aLocation;
    }


    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType aPositionType) {
        this.positionType = aPositionType;
    }


    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency aCoreCompetency) {
        this.coreCompetency = aCoreCompetency;
    }
}
