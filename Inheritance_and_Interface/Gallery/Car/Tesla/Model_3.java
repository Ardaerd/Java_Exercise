package Inheritance_and_Interface.Gallery.Car.Tesla;

public class Model_3 extends Tesla{

    public Model_3() {
        super(30_690.00,225.30,5.3,2021,"Model_3","Black");
    }

    @Override
    public void arrivalTime(double km) {
        super.arrivalTime(km);
    }

    public String toString() {
        return super.toString();
    }
}
