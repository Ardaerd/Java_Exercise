package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Gallery {

    private double revenue;
    private String name;
    private int numberOfSale;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Vehicle> soldVehicles;
    private ArrayList<Customer> customers;

    public Gallery(String name) {
        this.name = name;
        this.revenue = 0;
        this.numberOfSale = 0;
        vehicles = new ArrayList<Vehicle>();
        soldVehicles = new ArrayList<Vehicle>();
        customers = new ArrayList<Customer>();
    }

    public void addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listOfOption() {
        System.out.println("------ Welcome to " + name + " ------");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(1+i + "- " + vehicles.get(i).getModel() + " (" + vehicles.get(i).getBrand() + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void listOfCustomer() {
        System.out.println("------- List of Customer -------");
        for (int i = 0; i < customers.size(); i++) {

        }
    }

    public void listOfSoldVehicles() {
        System.out.println("------- List of Sold Vehicle -------");
        for (int i = 0; i < soldVehicles.size(); i++) {
            System.out.println(1+i + "- " + soldVehicles.get(i).getModel() + " (" + customers.get(i).getName() + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void sold(int option, Customer customer) {
        if (customer.buy(vehicles.get(option-1))) {
            revenue += vehicles.get(option-1).getPrice();
            numberOfSale++;
            soldVehicles.add(vehicles.get(option-1));
            customers.add(customer);
            System.out.println(vehicles.get(option-1).getModel() + " is sold.\n" +
                    "Good luck with your new car Mr/Mrs. " + customer.getName() + "\n" +
                    "Sold: +" + vehicles.get(option-1).getPrice());
        } else {
            System.out.println("The sale could not be realized.");
        }
    }

    public String toString() {
        return "Dealer name: " + name + "\n" +
                "Revenue: $ " + revenue + "\n" +
                "Number of Sales: " + numberOfSale + "\n";
    }
}
