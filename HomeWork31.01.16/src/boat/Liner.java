package boat;

public class Liner extends BoatType  {
    Liner(int weight, int speed) {
        super(weight, speed);
    }

    @Override
    void name() {
        System.out.println("This boat for tourists");
    }

    @Override
    int passengers() {
        int x = 3550;
        return x;
    }
}
