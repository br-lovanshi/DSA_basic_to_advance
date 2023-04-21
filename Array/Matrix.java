package Array;

import java.util.Arrays;

public class Matrix {
    
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        for(int i = 0;i<3;i++){
           for(int j = 0;j<3;j++){
            matrix[i][j]  = j;
           }
            
        } 

        for(int i = 0;i<3;i++){
            int val = 0;
            for(int j= 0;j<3;j++) {
                // val = matrix[i][j];
                System.out.println(matrix[i][j]);
            }
            // System.out.println(val);
        }
        // System.out.println(Arrays.deepToString(matrix));
    }
}
