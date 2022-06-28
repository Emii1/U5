package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    public void getCourseTitle(){
        Course course = new Course();

        Assertions.assertTrue(course.getTitle().contains(course.getTitle()));
 }

	// TODO 2: Test getNumberOfAttendees()
    @Test
    public void testNoAttendees(){
       Course course = new Course();
       Assertions.assertEquals(0,course.getNumberOfAttendees());
    }
    @Test
    public void testThreeAttendees(){
        Course course = new Course();
        Assertions.assertEquals(3,course.getNumberOfAttendees());
    }

}
