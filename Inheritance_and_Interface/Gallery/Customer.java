package Inheritance_and_Interface.Gallery;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private double spending;
    private ArrayList<Vehicle> myCars;
    private Gallery gallery;

    public Customer(String name, double money, Gallery gallery) {
        this.name = name;
        this.money = money;
        this.spending = 0;
        this.gallery = gallery;
        gallery.addCustomers(this);
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

    public void listOfSoldVehicle() {
        for (int i = 0; i < myCars.size(); i++) {
            System.out.print("- " + myCars.get(i).getModel() + " " + "($" + myCars.get(i).getPrice() + ")\n");
        }
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Money: $" + money + "\n" +
                "----------------";
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

