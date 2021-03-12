package Class.CarExercise;

public class Car {

    private String color;
    private String brand;
    private int gear;
    private double odometer;
    private double avgSpeed;
    private double currentSpeed;
    private double generalSpeed; // average of average speed;
    private double fuel;
    private int count; // the number of uses of the gear method

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.gear = 1;
        this.count = 1;
        this.fuel = 400;
        this.avgSpeed = 15;
        this.currentSpeed = 15;
    }

    public void remainingFuel() {
        System.out.println("Fuel: " + fuel);
    }

    public void carInfo() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel: " + fuel);
        System.out.println("Odometer: " + odometer  + "km");
        System.out.println("========================");
    }

    public void drive(int hours) {
        generalSpeed /= count;
        odometer = hours*generalSpeed;
        fuel -= odometer;
        System.out.printf("You traveled %.2f km.\n", odometer);
        if (fuel < 75) {
            System.out.println("Fuel alert!");
            System.out.println("Fuel: " + fuel);
        } else if (fuel < 50) {
            System.out.println("Your fuel less than 50");
            System.out.println("You need to get gas immediately");
        }
        System.out.println("========================");
    }

    public void acceleration(int a) {
        currentSpeed += a;
        generalSpeed += currentSpeed;
        count++;
        System.out.printf("Your initial Speed: %.1f km/h\n",currentSpeed);

        if (currentSpeed > avgSpeed) {
            System.out.println("You should increase gear.");
        } else if (avgSpeed > currentSpeed) {
            System.out.println("You should decrease gear.");
        }
        System.out.println("========================");
    }

    public void incrementGear() {
        gear++;
        switch (gear) {
            case 2:
                avgSpeed = 35;
                break;
            case 3:
                avgSpeed = 55;
                break;
            case 4:
                avgSpeed = 75;
                break;
            case 5:
                avgSpeed = 100;
                break;
            case 6:
                avgSpeed = 150;
                break;
            default:
                System.out.println("You shouldn't get more faster.");
                break;
        }
        System.out.println("Your current gear: " + gear);
    }

    public void decrementGear() {
        gear--;
        switch (gear) {
            case 1:
                avgSpeed = 15;
                break;
            case 2:
                avgSpeed = 35;
                break;
            case 3:
                avgSpeed = 55;
                break;
            case 4:
                avgSpeed = 75;
                break;
            case 5:
                avgSpeed = 100;
                break;
            case 6:
                avgSpeed = 150;
                break;
            default:
                System.out.println("You shouldn't get more faster.");
                break;
        }
        System.out.println("Your current gear: " + gear);
    }

}
