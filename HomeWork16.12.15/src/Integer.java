//Проверка двух цисел и присвоение им значний.

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int x, y, z;

        System.out.println("Добрый день!");

 one:    for(;;){

     System.out.println("Введите 1 число!");
      Scanner number1 = new Scanner(System.in);
       if(number1.hasNextInt()){
          x = number1.nextInt();
       }else {
          System.out.println("Введите число!");
          continue one;
       }

     System.out.println("Введите 2 число!");
     Scanner number2 = new Scanner(System.in);
     if(number1.hasNextInt()){
         y = number1.nextInt();
     }else {
         System.out.println("Введите число!");
         continue one;
     }


     if(-1000 > x || x > 1000 || -1000 > y || y > 1000  ) {
         System.out.println("Введите число поменьше!");
         continue one;
     }else if (x != y) {
         x = 0;
         y= 0;
         System.out.println("1ое число  = " + x + " ; 2ое число = " + y);
         break;
     }else {
         z = x + y;
         x = z;
         y= z;
         System.out.println("1ое число  = " + x + " ; 2ое число = " + y);
         break ;
     }

 }
    }
}
