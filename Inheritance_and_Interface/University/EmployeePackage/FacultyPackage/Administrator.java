package Inheritance_and_Interface.University.EmployeePackage.FacultyPackage;

import Inheritance_and_Interface.University.EmployeePackage.Faculty;
import Inheritance_and_Interface.University.University;

import java.util.ArrayList;

public class Administrator extends Faculty {

    private String department;
    private String headOfDepartment;

    public Administrator(String nameOfEmployee, University university, String nameOfFaculty, String department,String headOfDepartment) {
        super(nameOfEmployee,"Administrator", university, nameOfFaculty);
        this.department = department;
        this.headOfDepartment = headOfDepartment;
        super.setSalary(20_000.00);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Department: " + department + "\n" +
                super.getNameOfEmployee() + " is Head of " + headOfDepartment;
    }

}
