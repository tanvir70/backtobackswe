package swe;

import java.util.Arrays;

public class RotateImage {
    public static int[][] rotate(int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < (l / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][l - j - 1];
                matrix[i][l - j - 1] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Input: " + Arrays.deepToString(matrix));
        System.out.println("Output: " + Arrays.deepToString(rotate(matrix)));
    }
}
