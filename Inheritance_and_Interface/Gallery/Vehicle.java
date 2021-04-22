package Inheritance_and_Interface.Gallery;

public class Vehicle {
    private double price;
    private String model;
    private String brand;
    private int year;

    public Vehicle(double price, String model, String brand,int year) {
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String toString() {
        return "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Price: " + price + "\n" +
                "Year: " + year + "\n";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
