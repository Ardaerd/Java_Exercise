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

        System.out.print("Lawyer: ");
        Lawyer lawyer = new Lawyer();
        System.out.print(lawyer.getHours() + ", ");
        System.out.printf("$%.2f, ", lawyer.getSalary());
        System.out.print(lawyer.getVacationDays() + ", ");
        System.out.println(lawyer.getVacationForm());
        lawyer.sue();

        System.out.print("Legal Secretary: ");
        LegalSecretary legalSecretary = new LegalSecretary();
        System.out.print(legalSecretary.getHours() + ", ");
        System.out.printf("$%.2f, ", legalSecretary.getSalary());
        System.out.print(legalSecretary.getVacationDays() + ", ");
        System.out.println(legalSecretary.getVacationForm());
        legalSecretary.takeDictation("neato");
        legalSecretary.fileLegalBriefs();

    }
}
