public class Matrix {
    public static void main(String[] args) {
        int matrix[][] =  new int[3][3];


        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) ((j+1) * Math.pow(2,i));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


//        for(int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//
//                if(i == 0){
//                    matrix[i][j] = (j+1);
//                    System.out.print(matrix[i][j] + " ");
//                }else {
//                    matrix[i][j] = (i*2)*(j+1);
//                    System.out.print(matrix[i][j] + " ");
//                }
//
//            }
//            System.out.println();
//        }
    }
}
