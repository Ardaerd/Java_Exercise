package Inheritance_and_Interface.Employee_Information_System;

public abstract class Employee {
    private String name;
    private String eMail;
    private String number;
    private String status;
    private double salary;
    private Company company;

    public abstract void computePay();


    public Employee(String name, String eMail, String number, String status, double salary, Company company) {
        this.name = name;
        this.eMail = eMail;
        this.number = number;
        this.status = status;
        this.salary = salary;
        this.company = company;
        company.addEmployee(this);
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " \"" + eMail + "\"");
    }

    public String toString() {
        return "------------ " + name + " ------------\n" +
                "e-Mail of Employee: " + eMail + "\n" +
                "Number of Employee: " + number + "\n" +
                "Status of Employee: " + status + "\n" +
                "Salary of Employee: " + salary;
    }

    public String getStatus() {
        return status;
    }

    public double getSalary() {
        return salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNumber() {
        return number;
    }

    public Company getCompany() {
        return company;
    }
}
