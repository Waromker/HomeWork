package Car;

public class CarChoise {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        FamillyCar famillyCar = new FamillyCar();

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                famillyCar.nameOfCar();
                System.out.println(famillyCar.speedAtTheMoment());
            } else {
                sportCar.nameOfCar();
                System.out.println(sportCar.speedAtTheMoment());
            }
        }
    }
}
