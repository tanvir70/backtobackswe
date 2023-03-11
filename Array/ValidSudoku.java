package swe;

import java.util.*;
public class ValidSudoku {
    public static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> colum = new HashSet<>();
            Set<Integer> box = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != 0 && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != 0 && !colum.add(board[j][i])) {
                    return false;
                }
                int boxRow = 3 * (i / 3) + j / 3;
                int boxColum = 3 * (i % 3) + j % 3;
                if (board[boxRow][boxColum] != 0 && !box.add(board[boxRow][boxColum])) {
                    return false;
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
