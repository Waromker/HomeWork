package Car;


public class FamillyCar extends Car {
    @Override
    void nameOfCar() {
        System.out.println("This is familly-Car");
    }

    @Override
    int speedAtTheMoment() {
        int x;
        x = (maxSpeed- (minSpeed * 100)) /maxValueOfPassenger;
        return x;
    }
}
