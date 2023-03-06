package swe;
public class ChangingBaseDiff {
    public static String changeBase(String numAsString, int b1, int b2) {
        int numberUnderBase10 = convertToBase10(numAsString, b1);
        if (numberUnderBase10 == 0) {
            return "0";
        } else {
            return convertFromBase10(numberUnderBase10, b2);
        }
    }
    private static int convertToBase10(String numAsString, int base) {
        int result = 0;
        int power = 0;

        for (int i = numAsString.length() - 1; i >= 0; i--) {
            char digit = numAsString.charAt(i);
            int value = Character.isDigit(digit) ? digit - '0' : digit - 'A' + 10;
            result += value * Math.pow(base, power++);
        }
        return result;
    }
    private static String convertFromBase10(int numberUnderBase10, int base) {
        StringBuilder result = new StringBuilder();

        while (numberUnderBase10 > 0) {
            int remainder = numberUnderBase10 % base;
            char digit = remainder < 10 ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result.insert(0, digit);
            numberUnderBase10 /= base;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(changeBase("123", 4, 10));
    }
}

