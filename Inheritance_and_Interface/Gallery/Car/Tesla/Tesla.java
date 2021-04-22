package Inheritance_and_Interface.Gallery.Car.Tesla;

import Inheritance_and_Interface.Gallery.Car.Car;

public class Tesla extends Car {

    private boolean autoPilot;

    public Tesla(double price, double topSpeed, double acceleration,int year, String model, String fuelType) {
        super(price,topSpeed,acceleration,year,model,"Tesla","Electric");
        this.autoPilot = true;
    }

    public String checkAutoPlot() {
        if (autoPilot)
            return "Basic Autopilot";
        else
            return "Invalid feature";
    }

    public String toString() {
        return super.toString() +
                "Auto Pilot: " + checkAutoPlot() + "\n";
    }
}
