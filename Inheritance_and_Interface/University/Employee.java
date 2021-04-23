package Inheritance_and_Interface.University;

public class Employee {

    private String nameOfEmployee;
    private String status;
    private double salary;
    private University university;

    public Employee(String nameOfEmployee, String status, University university) {
        this.nameOfEmployee = nameOfEmployee;
        this.status = status;
        this.salary = 2_825.00;
        university.addEmployee(this);
    }

    public String toString() {
        return "------------" + university.getNameOfUniversity() + "------------\n" +
                "Rector: " + university.getRector() + "\n" +
                "Name of Employee: " + nameOfEmployee + "\n" +
                "Status of " + nameOfEmployee + ": " + status + "\n" +
                "Salary of " + nameOfEmployee + ": " + salary + "\n";
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public University getUniversity() {
        return university;
    }
}
