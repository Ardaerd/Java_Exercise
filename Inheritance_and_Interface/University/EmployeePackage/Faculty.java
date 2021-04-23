package Inheritance_and_Interface.University.EmployeePackage;

import Inheritance_and_Interface.University.Employee;
import Inheritance_and_Interface.University.University;

public class Faculty extends Employee {

    private String nameOfFaculty;

    public Faculty(String nameOfEmployee, String status, University university, String nameOfFaculty) {
        super(nameOfEmployee, status, university);
        super.setSalary(8_000.00);
        this.nameOfFaculty = nameOfFaculty;
    }

    public String toString() {
        return super.toString() +
                "Faculty: " + nameOfFaculty;
    }
}
