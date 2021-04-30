package Inheritance_and_Interface.Vehicle_BasicInterface;

public class Car implements Vehicle{

    public void accelerate() {
        System.out.println("Car acceleration is starting");
    }

    public void brake() {
        System.out.println("Car using Brake");
    }

    public void honk() {
        System.out.println("Car honk honk !");
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }
}
