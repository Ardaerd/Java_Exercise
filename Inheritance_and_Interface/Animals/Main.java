package Inheritance_and_Interface.Animals;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion();
        lion.makeNoise();
        lion.eat();
        System.out.println(lion.toString());
    }
}
