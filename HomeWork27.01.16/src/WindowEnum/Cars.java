package WindowEnum;

public enum Cars {
    SuperCar("big","low"){
        @Override
        public String toString() {
            return "SuperCar!Good car for have fun";
        }
    },
    FamilyCar("low","big"){
        @Override
        public String toString() {
            return "FamilyCar!Good car for a family";
        }
    },
    OutLander("center","center"){
        @Override
        public String toString() {
            return "OutLander! Good car to travel";
        }
    },
    NoCar(){
        @Override
        public String toString() {
            return "There is any car =( try another one!";
        }
    };

    public String speed;
    public String people;


    Cars(){

    }

    Cars(String speed,String people){
        this.speed = speed;
        this.people = people;
    }
    public static Cars lookForCar(String speedDescription, String peopleDescription){
        for (Cars yourCars : values()) {
                if (speedDescription.equals(yourCars.speed) && peopleDescription.equals(yourCars.people)) {
                    return yourCars;

                }
            }

        return NoCar ;
        }



}

