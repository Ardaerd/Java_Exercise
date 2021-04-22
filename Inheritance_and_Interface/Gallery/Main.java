package Inheritance_and_Interface.Gallery;

import Inheritance_and_Interface.Gallery.Car.Car;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_3;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_S;
import Inheritance_and_Interface.Gallery.Car.Tesla.Model_X;

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

        Customer customer_1 = new Customer("Arda Erdoğan", 500_000.00);
        Customer customer_2 = new Customer("Ekin Akan",1_000_000.00);
        Customer customer_3 = new Customer("Elon Musk",50_000.00);

        

    }

}
