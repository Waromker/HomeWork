package WindowEnum;


public class AnalyzeMethod {

    public String analyzeSpeed(String speed, String people){
        int carspeed = Integer.parseInt(speed);
        int peopleCount = Integer.parseInt(people);
        String vibor = "";

        if (carspeed <=60 && carspeed >0){
            speed = "low";
        }else if (carspeed > 60 && carspeed <= 120){
            speed = "center";
        }else if(carspeed > 120 && carspeed <300 ){
            speed = "big";
        }

        if (peopleCount <=2 && peopleCount >0){
            people = "low";
        }else if (peopleCount > 2 && peopleCount <= 4){
            people = "center";
        }else if (peopleCount >4 && peopleCount <=7) {
            people = "big";
        }



        Cars newCar =Cars.lookForCar(speed,people);
        vibor = newCar.toString();

        return vibor;
    }

}
