package BacktoBackSwe;

import java.util.Arrays;

public class Rotate2DArray {
    public static void main(String[] args) {
        int[][] matrix ={
                         {1, 2, 3},     // { 7  4  1
                         {4, 5, 6},     //   8  5  2
                         {7, 8, 9},     //   9  6  3 }

        };

        int size = matrix.length - 1;
        System.out.println(size);

        for (int layer = 0; layer < (matrix.length / 2); layer++){
            for (int i = layer; i < size - layer ; i++) {

                int top = matrix[layer][i];
                int right = matrix[i][size - layer];
                int bottom = matrix[size - layer][size - i];
                int left = matrix[size - i][layer];

                /*System.out.println(top);
                System.out.println(right);
                System.out.println(bottom);
                System.out.println(left);*/

                matrix[layer][i] = left;
                matrix[i][size - layer] = top;
                matrix[size - layer][size - i] = right;
                matrix[size - i][layer] = bottom;


            }

        }

        System.out.println(Arrays.deepToString(matrix));


    }
}
