package tech;

public class Airplane implements Fly {

    String name;

    @Override
    public void printNameFly(String name) {
        System.out.println("This is the name of plane - " + name);
    }

    @Override
    public int getSpeedFly(String name) {
        int x = 0;
        this.name = name;
        if (this.name == "Boing"){
            x = 800;
        } else if (this.name == "AH-24"){
            x = 450;
        }
        return x;
    }

    @Override
    public int getWeightweight(String name) {
        int x = 0;
        this.name = name;
        if (this.name == "Boing"){
            x = 31479;
        } else if (this.name == "AH-24"){
            x = 13350;
        }
        return x;
    }

    @Override
    public int getValueOfPassengers(String name) {
        int x = 0;
        this.name = name;
        if (this.name == "Boing"){
            x = 168;
        } else if (this.name == "AH-24"){
            x = 50;
        }
        return x;
    }

    @Override
    public void poitOfSafety() {

    }
}
