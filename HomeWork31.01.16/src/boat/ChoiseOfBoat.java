package boat;

public class ChoiseOfBoat {
    public static void main(String[] args) {
        Destroyer destroyer = new Destroyer(90,110);
        destroyer.bestSpeedforWeight();
        destroyer.name();
        System.out.println("Number of passengers is " + destroyer.passengers());

        System.out.println();

        Liner liner = new Liner(200,30);
        liner.bestSpeedforWeight();
        liner.name();
        System.out.println("Number of passengers is " + liner.passengers());
    }
}
