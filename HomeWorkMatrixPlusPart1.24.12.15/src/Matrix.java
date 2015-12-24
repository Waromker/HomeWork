
public class Matrix {
    public static void main(String[] args) {
        int d[][] = new int[3][3];
        int c[][] = new int[3][3];
        int k[][] = new int[3][3];


        for (int i = 0; i <d.length; i++) {
            for (int j = 0; j < c.length; j++){
               d[i][j] = (int) (Math.random() * 99);
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i <c.length; i++) {
            for (int j = 0; j < c.length; j++){
                c[i][j] = (int) (Math.random() * 99);
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nСумма матриц:");

        for (int i = 0; i <d.length; i++) {
            for (int j = 0; j < c.length; j++){
                k[i][j] = c[i][j] + d[i][j];
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nПроизведение матриц::");

        for (int i = 0; i <d.length; i++) {
            for (int j = 0; j < c.length; j++){
                k[i][j] = c[i][j] * d[i][j];
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }



    }
}
