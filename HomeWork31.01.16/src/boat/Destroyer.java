package boat;


public class Destroyer extends BoatType {
    public Destroyer(int weight, int speed) {
        super(weight, speed);
    }

    @Override
    void printName() {
        System.out.println("This is millitary boat - it is Destroyer ");
    }

    @Override
    int getValueOfPassengers() {
        int x = 120;
        return x;
    }
}
