package boat;


abstract public class BoatType {
    int weight;
    int speed;

   abstract void printName();

    abstract int getValueOfPassengers();

    BoatType(int weight, int speed){
        this.weight = weight;
        this.speed = speed;
    }

    void bestSpeedforWeight(){
        if (this.weight > 100 && this.speed >100){
            System.out.println("Dangeroгs speed");
        }else if (this.weight >100 && this.speed <100){
            System.out.println("Normal speed");
        }else if (this.weight < 100 && this.speed >100){
            System.out.println("Good speed");
        }
    }

}
