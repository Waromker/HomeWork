package boat;

public class Liner extends BoatType  {
    Liner(int weight, int speed) {
        super(weight, speed);
    }

    @Override
    void printName() {
        System.out.println("This boat for tourists");
    }

    @Override
    int getValueOfPassengers() {
        int x = 3550;
        return x;
    }
}
