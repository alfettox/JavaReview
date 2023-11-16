import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Array is a set of UNIFORM data that can be accessed by indexes
        // Vector = 1 dimensional array
        // Table = 2-dimensional array
        //  3D array
        // MULTIDIMENSIONAL JAGGED ARRAY irregular length of iterior arrays



        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };


        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int k =0; k< jaggedArray.length; k++){
            System.out.println(Arrays.toString(jaggedArray[k]));
        }


        int[][][] a3DArray = new int[3][3][3];

        a3DArray[0] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        a3DArray[1] = new int[][]{{9, 10, 11}, {12, 13}, {14, 15, 16}};
        a3DArray[2] = new int[][]{{17, 18, 19}, {20, 21}, {22, 23, 24}};

        for (int i = 0; i < a3DArray.length; i++) {
            for (int j = 0; j < a3DArray[i].length; j++) {
                for (int k = 0; k < a3DArray[i][j].length; k++) {
                    System.out.print(a3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length - 2; i += 3) {
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
        }


    }
}