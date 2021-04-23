package Inheritance_and_Interface.University.EmployeePackage.FacultyPackage;

import Inheritance_and_Interface.University.EmployeePackage.Faculty;
import Inheritance_and_Interface.University.University;

import java.util.ArrayList;

public class Teacher extends Faculty {

    private String department;
    private String cv;
    private ArrayList<String> researchAreas;

    public Teacher(String nameOfEmployee, University university, String nameOfFaculty, String department) {
        super(nameOfEmployee,"Teacher", university, nameOfFaculty);
        researchAreas = new ArrayList<String>();
        this.department = department;
        super.setSalary(15_000.00);
    }

    public void addResearchAreas(String researchAreas) {
        this.researchAreas.add(researchAreas);
    }

    public String getResearchAreas() {
        String str = "";
        for (int i = 0; i < researchAreas.size(); i++) {
            str += 1+i + "- " + researchAreas.get(i) + "\n";
        }
        return "-------------- " + super.getNameOfEmployee() + " --------------\n" +
                "Research Areas: \n" +
                str + "\n" +
                "---------------------------------------------------------------\n";
    }

    public String addCV(String cv) {

        return "-----------------------------------------" + super.getNameOfEmployee() + " -----------------------------------------\n" +
                cv + "\n" +

                getResearchAreas() +
                "--------------------------------------------------------------------------------------------------------------------";
    }

    public void setCV(String cv) {

        this.cv = addCV(cv);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCv() {
        return cv;
    }
}
