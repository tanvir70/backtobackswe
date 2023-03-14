package swe.Array;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralSequence(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int leftColum = 0;
        int rightColum = matrix.length - 1;
        int topRow = 0;
        int bottomRow = matrix[0].length - 1;

        while (leftColum <= rightColum && topRow <= bottomRow) {
            for (int i = leftColum; i <= rightColum; i++) {
                output.add(matrix[topRow][i]);
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                output.add(matrix[i][rightColum]);
            }
            rightColum--;

            if (topRow <= bottomRow) {

                for (int i = rightColum; i >= leftColum; i--) {
                    output.add(matrix[bottomRow][i]);
                }
            }
            bottomRow--;


            if (leftColum <= rightColum) {
                for (int i = bottomRow; i >= topRow; i--) {
                    output.add(matrix[i][leftColum]);
                }
            }
            leftColum++;

        }
        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralSequence(matrix));
    }
}
