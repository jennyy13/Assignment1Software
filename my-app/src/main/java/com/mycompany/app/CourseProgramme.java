package com.mycompany.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private ArrayList<Student> courseStudents = new ArrayList<Student>();
    private ArrayList<Module> courseModules = new ArrayList<Module>();
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addStudent(Student student) {
        courseStudents.add(student);
    }

    public void addModule(Module module) {
        courseModules.add(module);
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public ArrayList<Module> getCourseModules() {
        return courseModules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
}