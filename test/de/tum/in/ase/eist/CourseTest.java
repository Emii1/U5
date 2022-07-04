package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;



class CourseTest {


    @Test

    public void testGetCourseTitle() {
        //given
        String name = "Eist";
        Course crs = new Course(name);

        Assertions.assertEquals(name, crs.getTitle());

    }


    @Test

    public void testNoAttendees() {
        Course crs = new Course("Bllah");
        Assertions.assertEquals(0, crs.getNumberOfAttendees());
    }
    // @Test

    // public void testThreeAttendees(){
    //  Course course = new Course("some course");

    //  Assertions.assertEquals(3,course.getNumberOfAttendees());
    // }


}
