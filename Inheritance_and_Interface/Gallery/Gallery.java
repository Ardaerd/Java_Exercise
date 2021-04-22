package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Gallery {

    private double revenue;
    private String name;
    private int numberOfSale;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Vehicle> soldVehicles;

    public Gallery(String name) {
        this.name = name;
        this.revenue = 0;
        this.numberOfSale = 0;
        vehicles = new ArrayList<Vehicle>();
        soldVehicles = new ArrayList<Vehicle>();
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

    public void sales(int option) {
        revenue += vehicles.get(option-1).getPrice();
        numberOfSale++;
        soldVehicles.add(vehicles.get(option-1));
        System.out.println(vehicles.get(option-1).getModel() " is sold.");
    }
}
