package Class.CarExercise;

public class Main_Car {

    public static void main(String[] args) {
        Car car = new Car("Black", "Peugeot 3008");

        car.acceleration(10);
        car.incrementGear();
        car.acceleration(10);
        car.decrementGear();
        car.drive(3);
        car.carInfo();
        car.acceleration(150);
        car.incrementGear();
        car.drive(8);

    }

}
