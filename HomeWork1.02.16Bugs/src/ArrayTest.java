import java.util.Scanner;

public class ArrayTest {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int numberArray[] = new int[4];
        int findLowest;

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Enter a value for slot " + (i + 1) + ":");
            numberArray[i] = input.nextInt();
        }
      findLowest = getMin(numberArray);
//        findLowest = getMin(numberArray);
      displayOutput(findLowest);
    }

    public static int getMin(int num[]) {
        int lowestNum = 0;
        int min = num[0];
//        for (int j = 0; j < num.length; j++) {
//            if (num[j] > num[j+1]) { тут если я не ошибаюсь, то мы выпадали

        for (int j:num){
            if (min > j){
                min= j;
                lowestNum = j;
            }
        }
        return lowestNum;
    }

    public static void displayOutput(int lowest) {
        System.out.println("The lowest number is: " + lowest);
    }
}
