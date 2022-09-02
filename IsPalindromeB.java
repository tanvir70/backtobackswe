package BacktoBackSwe;

import java.util.Scanner;

public class IsPalindromeB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer value : ");
        int x = scan.nextInt();
        System.out.println(isPalindrome(x));;
    }

    public static boolean isPalindrome( int n){
        if ( n < 0 )
            return false;

        double logAnswer = Math.log10(n);
        int totalDigits = (int)(Math.floor(logAnswer)) + 1;
        int mask = (int)Math.pow(10,(totalDigits - 1));

        for (int i = 0; i < totalDigits / 2; i++) {
            int mostSignificantDigit = n / mask;
            int placeDigit = n % 10;

            if ( mostSignificantDigit != placeDigit){
                return false;
            }

            n = n % mask;
            n = n / 10;

            mask = mask / 100;

        }

    return true;
    }

}
