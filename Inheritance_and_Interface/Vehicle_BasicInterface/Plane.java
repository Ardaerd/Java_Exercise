package Inheritance_and_Interface.Vehicle_BasicInterface;

public class Plane implements Vehicle{
    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        System.out.println("Plane Acceleration Start");

    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Plane using Brake");

    }

    @Override
    public void honk() {
        // TODO Auto-generated method stub
        System.out.println("Plane Honk Honk !");

    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        System.out.println("Plane Engine Started");

    }
}
