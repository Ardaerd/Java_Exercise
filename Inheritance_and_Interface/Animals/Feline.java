package Inheritance_and_Interface.Animals;

public class Feline extends Animal{

    public Feline(String food, String name, String habitat, String color, String noise) {
        super(food, name, habitat, color, noise);
    }

    public String roam() {
        return super.getName() + " tend to avoid others of their own kind.";
    }

    public String toString() {
        return super.toString() + roam();
    }
}
