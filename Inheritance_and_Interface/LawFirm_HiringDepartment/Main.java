package Inheritance_and_Interface.LawFirm_HiringDepartment;

import java.util.Arrays;

// A client program to test the employee classes
public class Main {
    public static void main(String[] args) {
        System.out.print("Employee: ");

        Employee employee = new Employee();
        System.out.print(employee.getHours() + ", ");
        System.out.printf("$%.2f, ", employee.getSalary());
        System.out.print(employee.getVacationDays() + ", ");
        System.out.println(employee.getVacationForm());

        System.out.print("Secretary: ");
        Secretary secretary = new Secretary();
        System.out.print(secretary.getHours() + ", ");
        System.out.printf("$%.2f, ", secretary.getSalary());
        System.out.print(secretary.getVacationDays() + ", ");
        System.out.println(secretary.getVacationForm());
        secretary.takeDictation("hello");

    }
}
