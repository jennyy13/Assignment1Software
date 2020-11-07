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


    @Override
    public boolean equals(Object obj) {
        if(obj == this ) {
            return true;
        }
        if(!(obj instanceof Module)) {
            return false;
        }

        Module module = (Module) obj;
        return this.moduleName == module.moduleName && this.moduleID == module.moduleID;
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