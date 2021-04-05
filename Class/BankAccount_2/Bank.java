package Class.BankAccount_2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void display() {
        System.out.println("----- " + this.name + " -----");
        for (Customer customer : this.customers) {
            customer.report();
        }
        System.out.println("----------------------");
    }
}
