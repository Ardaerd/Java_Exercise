package Inheritance_and_Interface.Vehicle_BasicInterface;

public class Main {

    public static void main(String[] args) {
        Boat b = new Boat();
        Car c = new Car();
        Plane p = new Plane();
        b.startEngine();
        c.startEngine();
        p.startEngine();
        b.accelerate();
        c.accelerate();
        p.accelerate();
        b.brake();
        c.honk();
        p.honk();
    }
}
