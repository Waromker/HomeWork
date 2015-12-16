//Проверка двух цисел и присвоение им значний.

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        boolean k = false, l = false, mainoperation;

        System.out.println("Добрый день!");

        do {

            do {
                System.out.println("Введите 1 число!");
                Scanner number1 = new Scanner(System.in);
                if (number1.hasNextInt()) {
                    x = number1.nextInt();
                    k = true;
                } else {
                    System.out.println("Введите число!");
                }
            } while (k != true);


            do {
                System.out.println("Введите 2 число!");
                Scanner number2 = new Scanner(System.in);
                if (number2.hasNextInt()) {
                    y = number2.nextInt();
                    l = true;
                } else {
                    System.out.println("Введите число!");
                }
            } while (l != true);


            if (-1000 > x || x > 1000 || -1000 > y || y > 1000) {
                System.out.println("Введите число поменьше!");
                mainoperation = false;

            }else {
                mainoperation = true;
            }

            z = (x != y) ? 0 : (x + y);
        }while (mainoperation != true);

            System.out.println("1ое число  = " + z + " ; 2ое число = " + z);





    }
}