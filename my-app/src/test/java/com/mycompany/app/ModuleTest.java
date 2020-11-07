package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.Before;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;


public class ModuleTest {

    private Module moduleTest;
    private ArrayList<Student> studentTest;
    private ArrayList<CourseProgramme> courseTest;
    private CourseProgramme course1;
    private Student student1;

    @Before
    public void setup() {
        moduleTest = new Module("Physics", "PHY34");
        student1 = new Student("Jennifer", 21, new DateTime("1999-09-14"), 17309551);
        moduleTest.addStudent(student1);
        course1 = new CourseProgramme("Comp Sci", new DateTime("2020-09-28"), new DateTime("2021-05-20"));
        moduleTest.addCourse(course1);
        studentTest = new ArrayList<Student> ();
        studentTest.add(student1);
        courseTest = new ArrayList<CourseProgramme> ();
        courseTest.add(course1);
    }

    @Test
    public void getModuleName() {
        assertEquals( "Physics", moduleTest.getModuleName());
    }

    @Test
    public void getModuleStudents() {
        ArrayList<Student> moduleStudents = moduleTest.getModuleStudents();
        assertEquals(moduleStudents.size(), studentTest.size());
        for (int i =0; i< moduleStudents.size(); i++){
            assertEquals(studentTest.get(i), moduleStudents.get(i));
        }
    }

    @Test
    public void getModuleCourses() {
        ArrayList<CourseProgramme> moduleCourses = moduleTest.getModuleCourses();
        assertEquals(moduleCourses.size(), courseTest.size());
        for (int i =0; i< moduleCourses.size(); i++){
            assertEquals(courseTest.get(i), moduleCourses.get(i));
        }
    }
}