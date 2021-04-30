package Inheritance_and_Interface.Employee_Information_System;

import java.security.PublicKey;
import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;
    private double money;
    private String name;

    public Company(double money, String name) {
        this.name = name;
        this.money = money;
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void report() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public String getEmployeesName() {
        String names = "";

        for (int i = 0; i < employees.size(); i++) {
            names += i+1 + "- " + employees.get(i).getName() + "\n";
        }
        return names;
    }

    public String toString() {
        return "------------ " + name + " ------------\n" +
                "Numbers of Employee: " + employees.size() + "\n" +
                "Name of Employees: \n" + getEmployeesName() +
                "Company's Money: " + getMoney();
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
}
