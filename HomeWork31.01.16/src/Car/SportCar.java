package car;

public class SportCar extends Car {
    @Override
    void printNameOfCar() {
        System.out.println("This is sportcar");
    }

    @Override
    int getSpeedAtTheMoment() {
        int x;
        x = maxSpeed /(maxValueOfPassenger - 2);
        return x;
    }
}
