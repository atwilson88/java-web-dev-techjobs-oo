package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class JobTest {
    Job jobTest;
    Job jobTest2;
    Job jobTest3;
    Job jobTest4;
    Job jobTest5;

    @Before
    public void createJobObject() {
        jobTest = new Job();
        jobTest2 = new Job();
        jobTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }


    @Test
    public void testSettingJobId() {
        int test1 = jobTest.getId;
        int test2 = jobTest2.getId -1;
        assertEquals(test1, test2, .001);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        String testName = jobTest3.getName();
        Employer testEmployer = jobTest3.getEmployer();
        Location testLocation = jobTest3.getLocation();
        PositionType testPositionType = jobTest3.getPositionType();
        CoreCompetency testCoreCompetency = jobTest3.getCoreCompetency();

        assertEquals("Product tester", jobTest3.getName());
        assertEquals("ACME", jobTest3.getEmployer());
        assertEquals("Desert", jobTest3.getLocation());
        assertEquals("Quality control", jobTest3.getPositionType());
        assertEquals("Persistence", jobTest3.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
       assertFalse(jobTest4.equals(jobTest5));

    }

    @Test
    public void checkFirstRequirement() {


    }
}
