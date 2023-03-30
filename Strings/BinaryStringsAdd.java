package swe.Strings;

public class BinaryStringsAdd {
    public static String addition(String s1, String s2) {
        int num1 = Integer.parseInt(s1, 2);
        int num2 = Integer.parseInt(s2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        String s1 = "101";
        String s2 = "1";
        System.out.println(addition(s1, s2));
    }
}
