package com.mycompany.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> moduleStudents = new ArrayList<Student>();
    private ArrayList<CourseProgramme> moduleCourses = new ArrayList<CourseProgramme>();

    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public void addStudent(Student student) {
        moduleStudents.add(student);
    }

    public void addCourse(CourseProgramme courses) {
        moduleCourses.add(courses);
    }

    public String getModuleName() {
        return moduleName;
    }

    public ArrayList<Student> getModuleStudents() {
        return moduleStudents;
    }

    public ArrayList<CourseProgramme> getModuleCourses() {
        return moduleCourses;
    }
}