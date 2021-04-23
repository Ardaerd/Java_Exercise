package Inheritance_and_Interface.University.EmployeePackage.FacultyPackage;

import Inheritance_and_Interface.University.EmployeePackage.Faculty;
import Inheritance_and_Interface.University.University;

import java.util.ArrayList;

public class Teacher extends Faculty {

    private String department;

    public Teacher(String nameOfEmployee, University university, String nameOfFaculty, String department) {
        super(nameOfEmployee,"Teacher", university, nameOfFaculty);
        this.department = department;
        super.setSalary(15_000.00);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCv() {
        return super.getCv();
    }
}
