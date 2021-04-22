package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Gallery {

    private double revenue;
    private String name;
    private int numberOfSale;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Customer> customers;

    public Gallery(String name) {
        this.name = name;
        this.revenue = 0;
        this.numberOfSale = 0;
        vehicles = new ArrayList<Vehicle>();
        customers = new ArrayList<Customer>();
    }

    public void addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomers(Customer customer) {
        customers.add(customer);
    }

    public void listOfOption() {
        System.out.println("-------- Welcome to " + name + " --------");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(1+i + "- " + vehicles.get(i).getModel() + " (" + vehicles.get(i).getBrand() + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void listOfCustomer() {
        System.out.println("------- List of Customer -------");

        for (int i = 0; i < customers.size()-1; i++) {
            for (int j = 0; j < customers.size()-1-i; j++) {
                if (customers.get(j).getSpending() < customers.get(j+1).getSpending()) {
                    Customer temp = customers.get(j);
                    customers.set(j,customers.get(j+1));
                    customers.set(j+1,temp);

                }
            }
        }

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i+1 + "- " + customers.get(i).getName() + " ($" + customers.get(i).getSpending() + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void listOfSoldVehicles() {
        System.out.println("--------- List of Sold Vehicle ---------");
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).listOfSoldVehicle();
        }
        System.out.println("---------------------------------------");
    }

    public void sold(int option, Customer customer) {
        if (customer.buy(vehicles.get(option-1))) {
            revenue += vehicles.get(option-1).getPrice();
            numberOfSale++;
            System.out.println(vehicles.get(option-1).getModel() + " is sold.\n" +
                    "Good luck with your new car Mr/Mrs. " + customer.getName() + "\n" +
                    "Sold: + $" + vehicles.get(option-1).getPrice());
            System.out.println("---------------------------------------");
        } else {
            System.out.println("The sale could not be realized.");
            System.out.println("---------------------------------------");
        }
    }

    public String toString() {
        return "Dealer name: " + name + "\n" +
                "Revenue: $ " + revenue + "\n" +
                "Number of Sales: " + numberOfSale + "\n";
    }
}
