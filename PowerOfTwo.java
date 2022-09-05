package BacktoBackSwe;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = scan.nextInt();

        PowerOfTwo pow = new PowerOfTwo();
        System.out.println(pow.power(n));

    }
    boolean power( int x){
       if ( x == 0)
           return false;
       while ( x != 1){
           if ( x % 2 != 0)
               return false;
           x = x / 2;
       }
        return true;
    }
}
