package BacktoBackSwe;

import java.util.Scanner;

public class PowerOfTwoB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = scan.nextInt();

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println( n + " is a power of two.");
        else
            System.out.println( n + " is not a power of two.");

        }

    }

    /*n = 4
        4 to binary -> 100
        n > 0       -> 100 > 000 && {100 greater than zero}
        n - 1       -> (100 - 1) =  011
        n & (n - 1) -> 100 & 011 =  000
        {n & (n - 1)} == 0  -> 000 == 000   */