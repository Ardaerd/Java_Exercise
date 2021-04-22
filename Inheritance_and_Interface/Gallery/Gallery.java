package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Gallery {

    private double revenue;
    private String name;
    private ArrayList<Vehicle> vehicles;

    public Gallery(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
        vehicles = new ArrayList<Vehicle>();
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

    public void selling(int option) {
        revenue += vehicles.get(option-1).getPrice();
    }
}
