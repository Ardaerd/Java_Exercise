package Inheritance_and_Interface.Employee_Information_System;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(1_000_000,"Google");

        SoftwareDeveloper arda = new SoftwareDeveloper("Arda Erdogan","arderd@outlook.com","5414374277","AI",company);
        SoftwareDeveloper ekin = new SoftwareDeveloper("Ekin Akan","ekin.akan@outlook.com","5427688977","IoT",company);

        arda.addProgrammingLanguage("Java");
        arda.addProgrammingLanguage("Python");
        arda.addProgrammingLanguage("JavaScript");
        System.out.println(arda);

        company.report();
        System.out.println(company);
    }

}

