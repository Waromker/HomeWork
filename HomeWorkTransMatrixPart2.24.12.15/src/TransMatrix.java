import java.util.Random;

public class TransMatrix {
    public static void main(String[] args) {
        Random x = new Random();

        int y = x.nextInt(16);

        int matrix[][] = new int[y][y];
        int matrix2[][] = new  int[y][y];

        System.out.println("Вот что было :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] =i;

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n Вот что получилось :");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
              // matrix2[j][i] = matrix[i][j];
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
