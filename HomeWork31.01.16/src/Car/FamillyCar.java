package car;


public class FamillyCar extends Car {
    @Override
    void printNameOfCar() {
        System.out.println("This is familly-Car");
    }

    @Override
    int getSpeedAtTheMoment() {
        int x;
        x = (maxSpeed- (minSpeed * 100)) /maxValueOfPassenger;
        return x;
    }
}
