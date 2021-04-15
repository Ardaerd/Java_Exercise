package Inheritance_and_Interface.Animals;

public class Lion extends Feline{

    public Lion(String food, String name, String habitat, String color, String noise) {
        super("meat","Lion","Jungle","orange","Aaaaoowwwww");
    }

    public String toString() {
        return super.toString();
    }
}
