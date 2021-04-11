package Inheritance_and_Interface.LawFirm_HiringDepartment;

// A class to represent legal secretaries.
public class LegalSecretary extends Secretary {
    // Overrides getSalary from Employee class
    public double getSalary() {
        return super.getSalary() + 5000; // $5k more then general employees
    }

    // new behaviour of LegalSecretary Objects
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
