package Inheritance_and_Interface.Gallery;

import Inheritance_and_Interface.Gallery.Car.BMW.M4;
import Inheritance_and_Interface.Gallery.Car.BMW.X5;
import Inheritance_and_Interface.Gallery.Car.BMW.Z4;
import Inheritance_and_Interface.Gallery.Car.Car;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_3;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_S;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_X;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Car Model_3 = new Model_3();
        Car Model_s = new Model_S();
        Car Model_X = new Model_X();

        System.out.println(Model_3);
        System.out.println(Model_X);
        System.out.println(Model_s);

        Model_3.arrivalTime(500);
        Model_X.arrivalTime(500);
        Model_s.arrivalTime(500);

        Gallery gallery_1 = new Gallery("AutoNation");

        gallery_1.addVehicles(Model_3);
        gallery_1.addVehicles(Model_s);
        gallery_1.addVehicles(Model_X);

        gallery_1.listOfOption();

        Customer customer_1 = new Customer("Arda Erdoğan", 500_000.00, gallery_1);
        Customer customer_2 = new Customer("Ekin Akan",1_000_000.00, gallery_1);
        Customer customer_3 = new Customer("Elon Musk",50_000.00, gallery_1);

        gallery_1.sold(2,customer_1);
        gallery_1.sold(3,customer_2);
        gallery_1.sold(1,customer_3);
        gallery_1.sold(2,customer_3);
        gallery_1.sold(1,customer_1);
        gallery_1.sold(2,customer_2);
        gallery_1.sold(3,customer_1);

        gallery_1.listOfCustomer();
        gallery_1.listOfOption();
        gallery_1.listOfSoldVehicles();

        System.out.println(gallery_1);

        System.out.println(customer_1);
        System.out.println(customer_2);
        System.out.println(customer_3);

        Customer customer_4 = new Customer("Bill Gates",2_000_000.0,gallery_1);
        Customer customer_5 = new Customer("Mark Zuckerburg",200_000.0,gallery_1);

        Car M4 = new M4();
        Car X5 = new X5();
        Car Z4 = new Z4();

        System.out.println(M4);
        System.out.println(X5);
        System.out.println(Z4);

        M4.arrivalTime(500);
        X5.arrivalTime(500);
        Z4.arrivalTime(500);

        gallery_1.addVehicles(M4);
        gallery_1.addVehicles(X5);
        gallery_1.addVehicles(Z4);

        gallery_1.listOfOption();

        gallery_1.sold(6,customer_1);
        gallery_1.sold(4,customer_4);
        gallery_1.sold(5,customer_5);
        gallery_1.sold(6,customer_5);

        gallery_1.listOfCustomer();
        gallery_1.listOfOption();
        gallery_1.listOfSoldVehicles();

        System.out.println(gallery_1);

        System.out.println(customer_4);
        System.out.println(customer_5);
    }

}
