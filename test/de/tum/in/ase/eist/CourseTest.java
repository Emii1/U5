package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

class CourseTest {



    @Test
    
    public void getCourseTitle(){
        //given
        String name = "Eist";
        Course course = new Course( name);

        Assertions.assertEquals(name,course.getTitle());

 }

	// TODO 2: Test getNumberOfAttendees()
    @Test

    public void testNoAttendees(){
       Course course = new Course();
       Assertions.assertEquals(0,course.getNumberOfAttendees());
    }
    //@Test

   // public void testThreeAttendees(){
     //   Course course = new Course();

    //    Assertions.assertEquals(3,course.getNumberOfAttendees());
   // }

}
