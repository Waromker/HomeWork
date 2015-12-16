import java.util.Scanner;

//Нужно узнать какое число из 3 - меньше
public class MoreOrLess {
    public static void main(String[] args) {

        int x = 0, y = 0, z = 0, max = 0;
        boolean k = false, j = false, l = false, mainoparation;

        System.out.println("Добрый день!");

       do{
           do {


               System.out.println("Введите 1 число!");
               Scanner number1 = new Scanner(System.in);
               if (number1.hasNextInt()) {
                   x = number1.nextInt();
                   k = true;
               } else {
                   System.out.println("Введите число!");
               }
           }while (k != true);

           do {
               System.out.println("Введите 2 число!");
               Scanner number2 = new Scanner(System.in);
               if (number2.hasNextInt()) {
                   y = number2.nextInt();
                   j = true;
               } else {
                   System.out.println("Введите число!");
               }
           } while (j != true);


               do {
                   System.out.println("Введите 3 число!");
                   Scanner number3 = new Scanner(System.in);
                   if (number3.hasNextInt()) {
                       z = number3.nextInt();
                       l = true;
                   } else {
                       System.out.println("Введите число!");
                   }
               }while (l != true) ;


                   if (-1000 > x || x > 1000 || -1000 > y || y > 1000 || -1000 > z || z > 1000) {
                       System.out.println("Введите число поменьше!");
                       mainoparation = false;
                   }else {
                       mainoparation = true;
                   }

                   max = (x > z) ? ((x > y) ? x : y) : (z > y) ? z : y;
               }while (mainoparation != true);
            System.out.println("Максимальное число - " + max);




        }
    }

