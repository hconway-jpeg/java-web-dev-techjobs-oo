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
    Job invalidFieldJob;

    @Before
    public void createJobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        fancyJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        unequalJob1 = new Job("Job Title", new Employer ("LaunchCode"), new Location("Mushroom Forest"), new PositionType("Resident Genius"), new CoreCompetency( "Mad skills"));
        unequalJob2 = new Job("Job Title", new Employer ("LaunchCode"), new Location("Mushroom Forest"), new PositionType("Resident Genius"), new CoreCompetency( "Mad skills"));
        invalidFieldJob = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

//the empty constructor is this()
    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue((Integer)fancyJob.getId() instanceof Integer);
        assertEquals(8, fancyJob.getId());
        assertTrue(fancyJob.getName() instanceof String);
        assertEquals("Product Tester", fancyJob.getName());
        assertTrue(fancyJob.getEmployer() instanceof Employer);
        assertEquals("ACME", fancyJob.getEmployer().toString());
        assertTrue(fancyJob.getLocation() instanceof Location);
        assertEquals("Desert", fancyJob.getLocation().toString());
        assertTrue(fancyJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", fancyJob.getPositionType().toString());
        assertTrue(fancyJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", fancyJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(unequalJob1.equals(unequalJob2));
    }

    @Test
    public void testToStringMethodStartsWithEndsWithBlankLine() {
        assertTrue(fancyJob.toString().startsWith("\n"));
        assertTrue(fancyJob.toString().endsWith("\n"));
    }

    @Test
    public void testToStringMethodContainsLabelsForFields() {
        assertEquals("\n" + "ID: " + fancyJob.getId() + "\n" + "Name: " + fancyJob.getName() + "\n" + "Employer: " + fancyJob.getEmployer() + "\n" + "Location: " + fancyJob.getLocation() + "\n" + "Position Type: " + fancyJob.getPositionType() + "\n" + "Core Competency: " + fancyJob.getCoreCompetency() + "\n", fancyJob.toString());
    }

    @Test
    public void testDataNotAvailable() {
        System.out.println(invalidFieldJob.toString());
        assertEquals("\n" + "ID: " + invalidFieldJob.getId() + "\n" + "Name: " + invalidFieldJob.getName() + "\n" + "Employer: Data not available" + "\n" + "Location: " + invalidFieldJob.getLocation() + "\n" + "Position Type: " + invalidFieldJob.getPositionType() + "\n" + "Core Competency: " + invalidFieldJob.getCoreCompetency() + "\n", invalidFieldJob.toString());

    }

}
