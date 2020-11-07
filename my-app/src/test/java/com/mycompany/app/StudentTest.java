package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

    private Student studentTest;
    private ArrayList<CourseProgramme> courseTest;
    private ArrayList<Module> moduleTest;
    private CourseProgramme course1;
    private Module module1, module2, module3;

    @Before
    public void setup() {
        studentTest = new Student("Jennifer", 21, new DateTime("1999-09-14"), 17309551);
        module1 = new Module("Maths", "BCT4");
        module3 = new Module("Maths", "BCT4");
        studentTest.addModule(module1);
        course1 = new CourseProgramme("Comp Sci", new DateTime("2020-09-28"), new DateTime("2021-05-20"));
        studentTest.addCourse(course1);
        courseTest = new ArrayList<CourseProgramme> ();
        courseTest.add(course1);
        moduleTest = new ArrayList<Module> ();
        moduleTest.add(module3);
    }

    @Test
    public void getName() {
        assertEquals("Jennifer", studentTest.getName());
    }

    @Test
    public void getAge() {
        assertEquals( 21, studentTest.getAge());
    }

    @Test
    public void getDOB() {
        assertEquals(DateTime.parse("1999-09-14"), studentTest.getDOB());
    }

    public void getID() {
        assertEquals(17309551, studentTest.getID());
    }

    @Test
    public void getUsername() {
        assertEquals("Jennifer21", studentTest.getUsername());
    }


    @Test
    public void getRegisteredModules() {
        ArrayList<Module> registeredModules = studentTest.getRegisteredModules();
        assertEquals(registeredModules.size(), moduleTest.size());
        for (int i =0; i< registeredModules.size(); i++){
            assertEquals(moduleTest.get(i), registeredModules.get(i));
        }
    }

    @Test
    public void getRegisteredCourses() {
        ArrayList<CourseProgramme> registeredCourses = studentTest.getRegisteredCourses();
        assertEquals(registeredCourses.size(), courseTest.size());
        for (int i =0; i< registeredCourses.size(); i++){
            assertEquals(courseTest.get(i), registeredCourses.get(i));
        }
    }


}