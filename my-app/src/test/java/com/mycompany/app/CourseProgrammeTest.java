package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.Before;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class CourseProgrammeTest {

    private CourseProgramme courseProgrammeTest;
    private ArrayList<Student> studentTest;
    private ArrayList<Module> moduleTest;
    private Module module1, module2;

    @Before
    public void setup() {
        courseProgrammeTest = new CourseProgramme("Comp Sci", new DateTime("2020-09-28"), new DateTime("2021-05-20"));
        module1 = new Module("Maths", "BCT4");
        courseProgrammeTest.addModule(module1);
        module2 = new Module("Physics", "PHY34");
        courseProgrammeTest.addModule(module2);
        courseProgrammeTest.addStudent(new Student("Jennifer", 21, new DateTime("1999-09-14"), 17309551));

        studentTest = new ArrayList<Student> (Arrays. asList(new Student("Jennifer", 21, new DateTime("1999-09-14"), 17309551)));
        moduleTest = new ArrayList<Module> ();
        moduleTest.add(module1);
        moduleTest.add(module2);
    }

    @Test
    public void getCourseName() {
        assertEquals( "Comp Sci", courseProgrammeTest.getCourseName());
    }

    @Test
    public void getCourseStudents() {
        assertEquals(studentTest, courseProgrammeTest.getCourseStudents());
    }

    @Test
    public void getCourseModules() {
        assertEquals(moduleTest, courseProgrammeTest.getCourseModules());
    }

    @Test
    public void getStartDate() {
        assertEquals(DateTime.parse("2020-09-28"), courseProgrammeTest.getStartDate());
    }

    @Test
    public void getEndDate() {
        assertEquals(DateTime.parse("2021-05-20"), courseProgrammeTest.getEndDate());
    }
}