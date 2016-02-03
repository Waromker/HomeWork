package errorTest;


import java.util.Scanner;

public class UserMainInput extends Throwable {
    boolean end =false;




    public static void main(String[] args){
        int index = 0;
        int rightIndex = 0;
        boolean exit;
        String newIn;

        UserMainInput chekIndex = new UserMainInput();


        do {
            System.out.println("Please, enter index 1,2 or 3!");

            Scanner input = new Scanner(System.in);
            newIn = input.next();

            try {
                index = Integer.parseInt(String.valueOf(newIn));
            } catch (Exception errorOfNumber) {
                System.out.println("Please put onli Numbers");
            }



            try {
                rightIndex = chekIndex.chekRightIndex(index);

            } catch (UserMainInput userMainInput) {

            } catch (Exception errorSout){

                System.out.println("Not this index");
                System.out.println(errorSout);
                System.out.println();
            }
            exit = chekIndex.getEnd();


       }while (exit != true);
        System.out.println("This is your index - " + rightIndex);
    }



    public boolean getEnd(){
        return this.end;
    }



    public int chekRightIndex(int index) throws UserMainInput{
        if (index > 3 || index < 1) {
            throw new UserDontPutRightIndex();
        }else {
            this.end = true;
            return index;
        }
    }


}
