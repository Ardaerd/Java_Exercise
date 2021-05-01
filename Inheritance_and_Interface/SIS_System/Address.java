package Inheritance_and_Interface.SIS_System;

public class Address {
    private String street;
    private String neighborhood;
    private String city;

    public Address(String street, String neighborhood, String city) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public Address() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Address [Street: " + street + ", Neighborhood: " + neighborhood + ", City: " + city + "]";
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }
}
