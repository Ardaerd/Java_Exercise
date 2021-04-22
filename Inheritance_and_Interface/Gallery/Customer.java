package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private double spend;
    private ArrayList<Vehicle> myCars;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.spend = 0;
        myCars = new ArrayList<Vehicle>();
    }

    public boolean buy(Vehicle vehicle) {
        if (money > vehicle.getPrice()) {
            myCars.add(vehicle);
            money -= vehicle.getPrice();
            spend += vehicle.getPrice();
            return true;
        } else {
            System.out.println("You don't have enough money!!!");
            return false;
        }
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Money" + money + "\n";
    }

    public String getName() {
        return name;
    }
}

