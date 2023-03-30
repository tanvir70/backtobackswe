package swe.Strings;

import java.util.Scanner;
public class BinaryStringAddSecond {
    public static String addString(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;


        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += (s1.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (s2.charAt(j) - '0');
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tow number as String : ");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(addString(s1, s2));
    }
}
