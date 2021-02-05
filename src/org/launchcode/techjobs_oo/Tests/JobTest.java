package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    Job testJob1;
    Job testJob2;
    Job fancyJob;

    @Before
    public void createJobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        fancyJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

//the empty constructor is this()
    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //assertTrue(fancyJob.getId() instanceof int);
        assertTrue(fancyJob.getName() instanceof String);
        assertTrue(fancyJob.getEmployer() instanceof Employer);
        assertTrue(fancyJob.getLocation() instanceof Location);
        assertTrue(fancyJob.getPositionType() instanceof PositionType);
        assertTrue(fancyJob.getCoreCompetency() instanceof CoreCompetency);
    }

//    @Test
//    public void testJobsForEquality() {
//        //
//    }

}
