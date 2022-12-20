package swe;

public class ChangeBase {

    public static void main(String[] args) {
        ChangeBase cb = new ChangeBase();
        System.out.println(cb.changeBase("123", 4, 10));
    }

    public String changeBase(String numAsString, int b1, int b2) {
        if (b1 == b2) {
            return numAsString;
        } else if (b1 == 10) {
            return convertToBase(numAsString, b2);
        } else if (b2 == 10) {
            return convertToBase10(numAsString, b1);
        } else {
            return convertToBase(convertToBase10(numAsString, b1), b2);
        }

    }

    private String convertToBase10(String numAsString, int b1) {
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        int power = 0;
        int result = 0;
        for (int i = numAsString.length() - 1; i >= 0; i--) {
            char c = numAsString.charAt(i);
            if (c == '-') {
                isNegative = true;
            } else {
                int d = getDecimal(c);
                if (d >= b1) {
                    throw new IllegalStateException("Invalid number or base : " + numAsString + " " + b1);
                }
                result += d * (int) Math.pow(b1, power++);
            }
        }
        if (isNegative) {
            sb.append('-');
        }
        sb.append(result);
        return sb.toString();
    }

    private int getDecimal(char c) {
        if (c >= '0' && c <= '9') {
            return (int) c - '0';
        } else if (c >= 'A' && c <= 'Z') {
            return (int) c - 'A' + 10;
        }
        throw new IllegalArgumentException("Unsupported character " + c);
    }

    private String convertToBase(String numAsString, int b2) {
        if (numAsString == "0") {
            return numAsString;
        }
        int number;
        StringBuilder sbi = new StringBuilder();
        boolean isNegative = false;
        if (numAsString.charAt(0) == '-') {
            number = Integer.parseInt(numAsString.substring(1));
            isNegative = true;
        } else {
            number = Integer.parseInt(numAsString);
        }
        while (number != 0) {
            int nextDigit = number % b2;
            sbi.append(getDigit(nextDigit));
            number /= b2;
        }
        if (isNegative) {
            sbi.append('-');
        }

        return sbi.reverse().toString();
    }

    private char getDigit(int decimal) {
        if (decimal >= 0 && decimal <= 9) {
            return (char) (decimal + '0');
        } else if (decimal >= 10 && decimal <= 35) {
            return (char) (decimal + 'A' - 10);
        }
        throw new IllegalArgumentException("Unsupported Decimal: " + decimal);
    }
}
