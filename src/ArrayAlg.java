import java.util.Scanner;

//ADD TWO MATRICES TOGETHER
public class ArrayAlg {
    public static void main(String[] args) {

//        SUM TWO MATRICES
//        int rows = 2, columns = 3;
//        int[][] firstMatrix = {
//                {2, 3, 4},
//                {5, 2, 3}
//        };
//        int[][] secondMatrix = {
//                {-4, 5, 3},
//                {5, 6, 3}
//        };
//
//        int[][] sum = new int[rows][columns];
//        for(int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//            }
//        }
//        System.out.println("The total of the two matrices is: ");
//        for(int[] row : sum) {
//            for (int column : row) {
//                System.out.print(column + "    " + "\n");
//            }
//        }

//        FILLING AN ARRAY FROM THE CONSOLE
        Scanner arrScan = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int length = arrScan.nextInt();

        int[] arrNums = new int[length];

        System.out.println("Enter the various digits: ");
        for (int i = 0; i < length; i++){
            arrNums[i] = arrScan.nextInt();
        }

        System.out.println("All the number");
        for (int val: arrNums){
            System.out.println(val);
        }
    }
}
