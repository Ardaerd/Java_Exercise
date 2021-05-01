package Inheritance_and_Interface.Contacts;

public abstract class Person {
    private String name;
    private int yearOfBirth;
    private Address address;

    public Person(String name, int yearOfBirth, Address address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public Person() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Person [Name: " + name + ", Year of Birth: " + yearOfBirth + ", Address: " + address + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Address getAddress() {
        return address;
    }
}
