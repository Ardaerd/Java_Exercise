package Inheritance_and_Interface.SIS_System;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }


}
