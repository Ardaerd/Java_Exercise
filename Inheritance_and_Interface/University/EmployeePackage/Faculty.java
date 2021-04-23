package Inheritance_and_Interface.University.EmployeePackage;

import Inheritance_and_Interface.University.Employee;
import Inheritance_and_Interface.University.University;

public class Faculty extends Employee {

    private String nameOfFaculty;


    public Faculty(String nameOfEmployee, double salary, University university) {
        super(nameOfEmployee, salary, university);
    }
}
