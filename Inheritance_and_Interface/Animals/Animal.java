package Inheritance_and_Interface.Animals;

public class Animal {
    private String food;
    private String name;
    private String habitat;
    private String color;

    public Animal(String food, String name, String habitat, String color) {
        this.food = food;
        this.name = name;
        this.habitat = habitat;
        this.color = color;
    }

    public void makeNoise(String noise) {
        System.out.println(name + " makes a sound like that " + noise);
    }

    public void eat() {
        System.out.println(name + " eats " + food);
    }

    public void sleep(boolean sleep) {
        if (sleep)
            System.out.println("Watch out " + name + " is sleeping");
        else
            System.out.println(name + " is waking up. Runn!!!");
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getColor() {
        return color;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
