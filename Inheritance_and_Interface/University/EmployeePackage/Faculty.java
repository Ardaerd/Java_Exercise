package Inheritance_and_Interface.University.EmployeePackage;

import Inheritance_and_Interface.University.Employee;
import Inheritance_and_Interface.University.University;

import java.util.ArrayList;

public class Faculty extends Employee {

    private String nameOfFaculty;
    private String cv;
    private ArrayList<String> researchAreas;

    public Faculty(String nameOfEmployee, String status, University university, String nameOfFaculty) {
        super(nameOfEmployee, status, university);
        super.setSalary(8_000.00);
        this.nameOfFaculty = nameOfFaculty;
        researchAreas = new ArrayList<String>();
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
        return super.toString() +
                "Faculty: " + nameOfFaculty;
    }

    public String getCv() {
        return cv;
    }
}
