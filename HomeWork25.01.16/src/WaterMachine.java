import java.util.Scanner;

public class WaterMachine {
    public static void main(String[] args) {
        double money = 0;
        boolean doAgain =false;
        int coin1 =0;
        int money1 = 0;

        System.out.println("Ваш баланс - " + money);
        System.out.println("Введите   средста:\n 1)Купюры;\n 2)Монеты ");
     do {
         Scanner input = new Scanner(System.in);
          money1 = input.nextInt();
         System.out.println("монеты");
         Scanner inputcoin = new Scanner(System.in);
         coin1 = inputcoin.nextInt();
         System.out.println();
         doAgain = true;
     }while (doAgain != true);

        for (int i = 1; i <3; i++)
        switch (i) {

            case 1 :

                NoteMoney note = new NoteMoney();
                    double x = note.analyze(money1);
                    money = money + x;
                break;

            case 2:

                CoinMoney coin = new CoinMoney();

                    double y = coin.analyze(coin1);
                    money = money + y;
                    System.out.println(String.format("Ваш баланс  - " + money) );
                break;
        }

    }
}
