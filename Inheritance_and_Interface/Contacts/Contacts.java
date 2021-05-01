package Inheritance_and_Interface.Contacts;

import java.util.ArrayList;

public class Contacts implements Edit{
    private ArrayList<Person> people = new ArrayList<Person>();

    public boolean removePerson(Person person) {
        boolean checkPerson = people.remove(person);

        if (checkPerson)
            System.out.println(person.getName() + " is removed.");
        else
            System.out.println(person.getName() + " is not found.");

        return checkPerson;
    }


    public boolean savePerson(Person person) {

        if (people.contains(person)) {
            System.out.println(person.getName() + " is already added your contacts");
            return false;
        } else {
            boolean checkPerson = people.add(person);

            if (checkPerson) {
                System.out.println(person.getName() + " is added your contacts");
            } else {
                System.out.println(person.getName() + " is invalid contacts");
            }

            return checkPerson;
        }
    }

    public void displayPersonInformation(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Phone Number: " + person.getPhoneNumber());
        System.out.println("Year of Birth: " + person.getYearOfBirth());

        Address address = person.getAddress();
        System.out.println("Street: " + address.getStreet());
        System.out.println("Neighborhood: " + address.getNeighborhood());
        System.out.println("City: " + address.getCity());
    }

    public void displayAddressInformation(Person person) {
        Address address = person.getAddress();
        System.out.println("---------- " + person.getName() + "'s address ----------");
        System.out.println("Street: " + address.getStreet());
        System.out.println("Neighborhood: " + address.getNeighborhood());
        System.out.println("City: " + address.getCity());
    }

    public void listContacts() {
        for (Person person : people) {
            System.out.println("------------ " + person.getName() + " ------------");
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("City: " + person.getAddress().getCity());
        }
    }
}
