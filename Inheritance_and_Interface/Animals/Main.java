package Inheritance_and_Interface.Animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal lion = new Lion();
        Animal tiger = new Tiger();

        animals.add(lion);
        animals.add(tiger);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
            System.out.println("=======================");
        }
    }
}
