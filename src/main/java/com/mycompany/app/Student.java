package com.mycompany.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private ArrayList<CourseProgramme> registeredCourses = new ArrayList<CourseProgramme>();
    private ArrayList<Module> registeredModules = new ArrayList<Module>();


    public Student(String name, int age, DateTime DOB, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this ) {
            return true;
        }
        if(!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;
        return this.name == student.name && this.age == student.age && this.DOB == student.DOB && this.ID == student.ID;
    }

    public void addCourse(CourseProgramme course) {
        registeredCourses.add(course);
    }

    public void addModule(Module module) {
        registeredModules.add(module);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return this.name + this.age;
    }

    public ArrayList<CourseProgramme> getRegisteredCourses() {
        return registeredCourses;
    }

    public ArrayList<Module> getRegisteredModules() {
        return registeredModules;
    }
}