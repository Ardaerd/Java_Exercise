package Inheritance_and_Interface.Contacts;

import Inheritance_and_Interface.University.Student;

public class Main {

    public static void main(String[] args) {
        Address address_1 = new Address("Barış blv.","Atakum","Samsun");
        Students arda = new Students("Arda Erdogan","(541) 437 42 77",2000,address_1,"S020973","Computer Science");

        Address address_2 = new Address("OZU","Çekmeköy","Istanbul");
        Students ekin = new Students("Ekin Akan","(542) 527 89 21",1998,address_2,"S080348","Electric Electronic");

        Address address_3 = new Address("OZU","Çekmeköy","Istanbul");
        Students ipek = new Students("Ipek Kaya","(543) 234 89 77",2000,address_3,"S020974","Gastronomi");

        StudentsImp students = new StudentsImp();

        ekin.addLecture("Cs_103");
        ekin.addLecture("Math_204");
        ekin.addLecture("EE_101");
        ekin.addLecture("Hist_309");

        ipek.addLecture("Gast_101");
        ipek.addLecture("Eng_102");
        ipek.addLecture("Bus_101");
        ipek.addLecture("Hist_201");

        arda.addLecture("Cs_102");
        arda.addLecture("Math_104");
        arda.addLecture("Phys_104");
        arda.addLecture("Hist_201");
        arda.addLecture("Bus_101");
        arda.addLecture("Eng_102");

        System.out.println(arda);
        System.out.println(arda.getPhoneNumber());

        System.out.println(ekin);
        System.out.println(ekin.getPhoneNumber() + "\n");

        students.saveStudent(arda);
        students.saveStudent(ekin);
        students.saveStudent(arda);
        students.removeStudent(ipek);
        students.displayStudent(arda);
        students.listStudent();
    }

}
