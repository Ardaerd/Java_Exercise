package Inheritance_and_Interface.University.EmployeePackage.FacultyPackage;

import Inheritance_and_Interface.University.EmployeePackage.Faculty;
import Inheritance_and_Interface.University.University;

public class Teacher extends Faculty {

    private String department;

    public Teacher(String nameOfEmployee, University university, String nameOfFaculty) {
        super(nameOfEmployee,"Teacher", university, nameOfFaculty);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Department: " + department;
    }
}
