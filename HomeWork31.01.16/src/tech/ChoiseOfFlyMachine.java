package tech;




public class ChoiseOfFlyMachine {
    public static void main(String[] args) {
        Airplane newObject = new Airplane();
        String choiseOfMachine;

        for (int i=0;i < 2;i++){
            if(i == 0){
                choiseOfMachine = "Boing";
            }else {
                choiseOfMachine = "AH-24";
            }
            newObject.nameFly(choiseOfMachine);
            System.out.println("Speed of " +choiseOfMachine+ " = " + newObject.speedFly(choiseOfMachine));
            System.out.println("Weight of " +choiseOfMachine+ " = " + newObject.weightweight(choiseOfMachine));
            System.out.println("Value of Passengers in " +choiseOfMachine+ " = " + newObject.valueOfPassengers(choiseOfMachine));
            System.out.println();
        }

    }
}
