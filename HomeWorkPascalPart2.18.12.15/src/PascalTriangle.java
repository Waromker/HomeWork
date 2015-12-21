public class PascalTriangle {
    public static void main(String[] args) {

        int numberoflines = 10;

        int [][] point = new int [numberoflines][];
        
        point[0] = new int [1];
        point[1] = new int [2];
        point[1][0] = point[1][1] = 1;


        System.out.println(point[0][0] = 1);
        System.out.println(point[1][0] + " " + point[1][1]);


        for (int i = 2; i < point.length; i++) {
            point[i] = new int [i+1];
            System.out.print((point[i][0] = 1) + " ");
            for (int j = 1; j < i; j++) {
                System.out.print((point[i][j] = point[i-1][j-1] + point[i-1][j]) + " ");
            }
            System.out.println(point[i][i]=1);
        }
    }

}