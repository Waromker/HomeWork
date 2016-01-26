public class NoteMoney {


    public  double analyze(int input){
        int x;

        x = input;
        if (x != 1 & x != 2 & x != 5 & x != 10) {
            System.out.println("Внесите купюры только перечисленного наминала!");
          x = 0 ;
        }
        return x;
    }
}


