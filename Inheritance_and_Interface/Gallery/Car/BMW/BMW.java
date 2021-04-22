package Inheritance_and_Interface.Gallery.Car.BMW;

import Inheritance_and_Interface.Gallery.Car.Car;

public class BMW extends Car {

    public BMW(double price, double topSpeed, double acceleration,int year, String model, String fuelType, String color) {
        super(price, topSpeed, acceleration, year, model, "BMW", fuelType, color);
    }

    public String toString() {
        return super.toString();
    }
}
