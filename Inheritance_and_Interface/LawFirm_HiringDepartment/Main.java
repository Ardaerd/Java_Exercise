package Inheritance_and_Interface.LawFirm_HiringDepartment;

// A client program to test the employee classes
public class Main {
    public static void main(String[] args) {
        System.out.print("Employee: ");

        Employee employee = new Employee();
        System.out.print(employee.getHours() + ", ");
        System.out.printf("$%.2f, ", employee.getSalary());
        System.out.print(employee.getVacationDays() + ", ");
        System.out.print(employee.getVacationForm());

        System.out.print("Secretary: ");
        Secretary secretary = new Secretary();
        
    }
}
