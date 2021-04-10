package Inheritance_and_Interface.LawFirm_HiringDepartment;

// A class to represent legal secretaries.
public class LegalSecretary extends Secretary {
    // Overrides getSalary from Employee class
    public double getSalary() {
        return 45000.0;
    }

    // new behaviour of LegalSecretary Objects
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
