package Inheritance_and_Interface.Employee_Information_System;

import java.util.ArrayList;

public class SoftwareDeveloper extends Employee implements DeveloperSkills{
    private ArrayList<String> programmingLanguage;
    private String workingArea;

    public SoftwareDeveloper(String name, String eMail, String number,String workingArea, Company company) {
        super(name, eMail, number, "Software Developer", 20_000.0, company);
        programmingLanguage = new ArrayList<String>();
        this.workingArea = workingArea;
        computePay();
    }

    public String getProgrammingLanguage() {
        String language = "[";

        if (programmingLanguage.size() == 0) {
            language += "]";
        } else if (programmingLanguage.size() == 1) {
            language += programmingLanguage.get(0) + "]";
        } else {
            for (int i = 0; i < programmingLanguage.size()-1; i++) {
                language += programmingLanguage.get(i) + ", ";
            }
            language += programmingLanguage.get(programmingLanguage.size()-1) + "]";
        }

        return language;
    }

    public void addProgrammingLanguage(String language) {
        programmingLanguage.add(language);
    }

    public void computePay() {
        getCompany().setMoney(getCompany().getMoney()-super.getSalary());
    }

    public String toString() {
        return super.toString() + "\n" +
                "Working Area of Employee: " + workingArea + "\n" +
                "Known Programming Language: " + getProgrammingLanguage();
    }
}
