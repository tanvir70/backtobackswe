package swe.Strings;

import java.util.Arrays;

public class ZigZagConversation {
    public static String zigzagConstruct(String str, int rows) {
        if (rows == 1) {
            return str;
        }

        String[] zigzag = new String[rows];
        Arrays.fill(zigzag, "");// zigzag = {"", "", ""}

        int currentRow = 0;
        boolean goingDown = false;
        for (char c : str.toCharArray()) {
            zigzag[currentRow] += c;

            if (currentRow == 0 || currentRow == rows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder sb = new StringBuilder();
        for (String row:
             zigzag) {
            sb.append(row);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(zigzagConstruct("YELLOWPINK", 4)); // YPEWILONLK
        System.out.println(zigzagConstruct("REDBLUEBLACK", 2)); // RDLELCEBUBAK
        System.out.println(zigzagConstruct("REDBLUEBLACK", 1)); // REDBLUEBLACK
    }
}
