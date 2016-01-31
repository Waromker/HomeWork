package Car;

public class SportCar extends Car {
    @Override
    void nameOfCar() {
        System.out.println("This is sportcar");
    }

    @Override
    int speedAtTheMoment() {
        int x;
        x = maxSpeed /(maxValueOfPassenger - 2);
        return x;
    }
}
