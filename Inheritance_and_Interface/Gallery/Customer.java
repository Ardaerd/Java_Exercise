package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private double spending;
    private ArrayList<Vehicle> myCars;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.spending = 0;
        myCars = new ArrayList<Vehicle>();
    }

    public boolean buy(Vehicle vehicle) {
        if (money > vehicle.getPrice()) {
            myCars.add(vehicle);
            money -= vehicle.getPrice();
            spending += vehicle.getPrice();
            return true;
        } else {
            System.out.println(name + " doesn't have enough money!!!");
            return false;
        }
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Money" + money + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setSpending(double spending) {
        this.spending = spending;
    }

    public void setMyCars(ArrayList<Vehicle> myCars) {
        this.myCars = myCars;
    }

    public double getMoney() {
        return money;
    }

    public double getSpending() {
        return spending;
    }

    public ArrayList<Vehicle> getMyCars() {
        return myCars;
    }

    public String getName() {
        return name;
    }
}

