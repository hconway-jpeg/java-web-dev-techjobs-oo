package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    Job testJob1;
    Job testJob2;
    Job fancyJob;
    Job unequalJob1;
    Job unequalJob2;

    @Before
    public void createJobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        fancyJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        unequalJob1 = new Job("Job Title", new Employer ("LaunchCode"), new Location("Mushroom Forest"), new PositionType("Resident Genius"), new CoreCompetency( "Mad skills"));
        unequalJob2 = new Job("Job Title", new Employer ("LaunchCode"), new Location("Mushroom Forest"), new PositionType("Resident Genius"), new CoreCompetency( "Mad skills"));
    }

//the empty constructor is this()
    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //assertTrue(fancyJob.getId() instanceof int); **HELP**
        assertTrue(fancyJob.getName() instanceof String);
        assertTrue(fancyJob.getEmployer() instanceof Employer);
        assertTrue(fancyJob.getLocation() instanceof Location);
        assertTrue(fancyJob.getPositionType() instanceof PositionType);
        assertTrue(fancyJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(unequalJob1 == unequalJob2);
    }

//    @Test
//    public void testToStringMethod() {
//        //
//    }

}
