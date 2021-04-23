package Inheritance_and_Interface.University.EmployeePackage.FacultyPackage;

import Inheritance_and_Interface.University.EmployeePackage.Faculty;
import Inheritance_and_Interface.University.University;

public class Administrator extends Faculty {

    private String department;

    public Administrator(String nameOfEmployee, University university, String nameOfFaculty, String department) {
        super(nameOfEmployee,"Administrator", university, nameOfFaculty);
        this.department = department;
        super.setSalary(20_000.00);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Department: " + department;
    }

}
