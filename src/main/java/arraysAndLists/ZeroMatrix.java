package arraysAndLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ZeroMatrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = new int[4][4];
        //fill out array
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x<matrix[i].length; x++) {
                matrix[i][x] = ThreadLocalRandom.current().nextInt(0, 4 + 1);
            }
        }
        zeroMatrix(matrix);

        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static void zeroMatrix(int[][] matrix) {
        //go through each for loop and if it is a zero, keep track of location
        //once all zeros are tracked, go through the arrays again and for each, change all in columns and rows
        ArrayList<Integer> rowLocationsToBeAllZeros = new ArrayList<Integer>();
        ArrayList<Integer> columnLocationsToBeAllZeros = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x<matrix[i].length; x++) {
                if (matrix[i][x] == 0 ) {
                    rowLocationsToBeAllZeros.add(i);
                    columnLocationsToBeAllZeros.add(x);
                }
            }
        }

        //set zeros
        for (Integer column : columnLocationsToBeAllZeros) {
            //change all in those columns to zero
        }
        for (Integer row : rowLocationsToBeAllZeros) {
            //change all in these rows to zero
        }

        System.out.println("ROWS" + rowLocationsToBeAllZeros);
        System.out.println("COLUMNS" + columnLocationsToBeAllZeros);

    }
    
}
