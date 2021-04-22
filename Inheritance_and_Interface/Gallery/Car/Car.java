package Inheritance_and_Interface.Gallery.Car;

import Inheritance_and_Interface.Gallery.Vehicle;

public class Car extends Vehicle {

    private double topSpeed;
    private double acceleration;
    private String fuelType;
    private String color;

    public Car(double price, double topSpeed, double acceleration,int year, String model, String brand, String fuelType, String color) {
        super(price, model, brand, year);
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.fuelType = fuelType;
        this.color = color;
    }

    public void arrivalTime(double km) {
        System.out.println("----------------------- " + super.getModel() + " -----------------------");
        System.out.println("You can go " + km + " km in " + topSpeed/km + " hours with " + getBrand() + ", " +
                getModel() + ".\n");
    }

    public String toString() {
        return super.toString() +
                "Color: " + color + "\n" +
                "Acceleration (0-100 KM/H): " + acceleration + " s\n" +
                "Top Speed: " + topSpeed + " km/h\n" +
                "Fuel Type: " + fuelType + "\n";
    }
}
