package Homework3;

public class Car {

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void start(boolean switchOnEngine) {
        if (switchOnEngine) {
            System.out.println("Engine is switched on");
        } else {
            System.out.println("You need start a car");
        }
    }

    public void drive() {
        System.out.println(speed != 0 ? "Car is driving" : "Car was stopped");
    }

    public void stop() {
        System.out.println("Engine is switched off");
    }

    public void keepSpeed(int speedLevel) {
        if (speed != speedLevel) {
            System.out.println("Change speed to " + speedLevel);
        }
    }

    public static void main(String[] args) {
        Car testCar = new Car(5);
        testCar.start(true);
        testCar.drive();
        testCar.keepSpeed(120);
        testCar.stop();
    }
}
