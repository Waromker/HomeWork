import java.util.Scanner;

//Нужно узнать какое число из 3 - меньше
public class MoreOrLess {
    public static void main(String[] args) {

        int x, y, z, max;

        System.out.println("Добрый день!");

        one:
        for (; ; ) {

            System.out.println("Введите 1 число!");
            Scanner number1 = new Scanner(System.in);
            if (number1.hasNextInt()) {
                x = number1.nextInt();
            } else {
                System.out.println("Введите число!");
                continue one;
            }

            System.out.println("Введите 2 число!");
            Scanner number2 = new Scanner(System.in);
            if (number2.hasNextInt()) {
                y = number2.nextInt();
            } else {
                System.out.println("Введите число!");
                continue one;
            }

            System.out.println("Введите 3 число!");
            Scanner number3 = new Scanner(System.in);
            if (number3.hasNextInt()) {
                z = number3.nextInt();
            } else {
                System.out.println("Введите число!");
                continue one;
            }


            if (-1000 > x || x > 1000 || -1000 > y || y > 1000 || -1000 > z || z > 1000) {
                System.out.println("Введите число поменьше!");
                continue one;
            }

            max = (x > z) ? ((x > y)? x : y):(z > y)? z : y;

            System.out.println("Максимальное число - " + max);
            break ;

            }

        }
    }

