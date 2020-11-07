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
    private Module module1;
    private Student student1;

    @Before
    public void setup() {
        courseProgrammeTest = new CourseProgramme("Comp Sci", new DateTime("2020-09-28"), new DateTime("2021-05-20"));
        module1 = new Module("Maths", "BCT4");
        courseProgrammeTest.addModule(module1);
        student1 = new Student("Jennifer", 21, new DateTime("1999-09-14"), 17309551);
        courseProgrammeTest.addStudent(student1);
        studentTest = new ArrayList<Student> ();
        studentTest.add(student1);
        moduleTest = new ArrayList<Module> ();
        moduleTest.add(module1);
    }

    @Test
    public void getCourseName() {
        assertEquals( "Comp Sci", courseProgrammeTest.getCourseName());
    }

    @Test
    public void getStartDate() {
        assertEquals(DateTime.parse("2020-09-28"), courseProgrammeTest.getStartDate());
    }

    @Test
    public void getEndDate() {
        assertEquals(DateTime.parse("2021-05-20"), courseProgrammeTest.getEndDate());
    }


    @Test
    public void getCourseModules() {
        ArrayList<Module> coursesModules = courseProgrammeTest.getCourseModules();
        assertEquals(coursesModules.size(), moduleTest.size());
        for (int i =0; i< coursesModules.size(); i++){
            assertEquals(moduleTest.get(i), coursesModules.get(i));
        }
    }

    @Test
    public void getCourseStudents() {
        ArrayList<Student> courseStudents = courseProgrammeTest.getCourseStudents();
        assertEquals(courseStudents.size(), studentTest.size());
        for (int i =0; i< courseStudents.size(); i++){
            assertEquals(studentTest.get(i), courseStudents.get(i));
        }
    }
}