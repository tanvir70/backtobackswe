package swe;
import java.util.*;
public class ValidSudokuClean {
    public static boolean isValidSudoku(int[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int currentValue = board[i][j];
                if ( currentValue != 0){
                    if(!seen.add(currentValue + "found in row" + i) ||
                            !seen.add(currentValue + "found in colum" + j) ||
                            !seen.add(currentValue + "found in sub grid" + i/3 +"-" + j/3)){
                        return false;
                    }

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        System.out.println("Valid Sudoku " + isValidSudoku(board));
    }
}
