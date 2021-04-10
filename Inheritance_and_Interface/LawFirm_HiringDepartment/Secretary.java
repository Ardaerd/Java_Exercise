package Inheritance_and_Interface.LawFirm_HiringDepartment;

// A class to represent secretaries.
public class Secretary extends Employee{
    public void takeDictation(String text) {
        System.out.println("Dictating text: " + text);
    }
}
