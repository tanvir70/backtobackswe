package BacktoBackSwe;

import java.util.Scanner;
public class EnumerateAllPrime {

    public boolean isPrime( int n ){
        for (int i = 2; i < n; i++)
            if ( n % i == 0)
                return false;

        return true;
    }
    void printPrime( int n){

        for (int i = 2; i <= n; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        EnumerateAllPrime prime = new EnumerateAllPrime();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value to detect prime numbers : ");
        int n = scan.nextInt();
        prime.printPrime(n);
    }

}
