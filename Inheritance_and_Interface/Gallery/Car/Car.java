package Inheritance_and_Interface.Gallery.Car;

import Inheritance_and_Interface.Gallery.Vehicle;

public class Car extends Vehicle {

    private double topSpeed;
    private double acceleration;
    private String fuelType;

    public Car(double price, double topSpeed, double acceleration,int year, String model, String brand, String fuelType) {
        super(price, model, brand, year);
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.fuelType = fuelType;
    }

    public void arrivalTime(double km) {
        System.out.println("You can go " + km + " km in " + topSpeed/km + " hours with " + getBrand() + ", " +
                getModel() + ".");
    }

    public String toString() {
        return super.toString() +
                "Acceleration (0-100 KM/H): " + acceleration + " s\n" +
                "Top Speed: " + topSpeed + " km/h\n" +
                "Fuel Type: " + fuelType + "\n";
    }
}
