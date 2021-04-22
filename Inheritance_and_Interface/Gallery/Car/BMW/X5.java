package Inheritance_and_Interface.Gallery.Car.BMW;

public class X5 extends BMW{

    public X5() {
        super(105_000.00,230.00,4.3,2021,"X5 M","Oil","Tanzanite Blue II Metalic");
    }

    public String toString() {
       return super.toString();
    }
}
