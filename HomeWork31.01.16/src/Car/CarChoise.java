package car;



public class CarChoise {
    public static void main(String[] args) {
        Car carsInfo[] = {
                new SportCar(),
                new FamillyCar(),

        };


        for (Car car: carsInfo) {
            if (car instanceof FamillyCar) {
                car.printNameOfCar();
                System.out.println(car.getSpeedAtTheMoment());
            } else {
                car.printNameOfCar();
                System.out.println(car.getSpeedAtTheMoment());
            }
        }
    }
}
