package Inheritance_and_Interface.Contacts;

public interface Edit {
    public boolean removePerson(Person person);
    public boolean savePerson(Person person);
    public void displayPersonInformation(Person person);
    public void displayAddressInformation(Person person);
    public void listContacts();
}
