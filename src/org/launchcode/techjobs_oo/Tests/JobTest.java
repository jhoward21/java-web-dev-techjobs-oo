package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class JobTest {
    Job test_job = new Job();
    Job test_job2 = new Job();
    Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
    @Before
    public void jobObjects(){

    }
    @Test
    public void testSettingJobId(){
        assertEquals(test_job.getId() +1, test_job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Assert.assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }
    @Test
    public void  testJobsForEquality(){
        assertFalse(test_job.equals(test_job2));
    }
    @Test
    public void testForToString (){
        if(test_job3.equals(test_job3)) {
            assertEquals("ID: " + test_job3.getId() + "\n" +
                    "Name: " + test_job3.getName() + "\n" +
                    "Employer: " + test_job3.getEmployer() + "\n" +
                    "Location: " + test_job3.getLocation() + "\n" +
                    "Position Type: " + test_job3.getPositionType() + "\n" +
                    "Core Competency: " + test_job3.getCoreCompetency(), test_job3.toString());
        } else if (test_job3.equals(" ")) {
            System.out.println("Data not available!");
        }
    }
}
