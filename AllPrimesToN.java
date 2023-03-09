package swe;

import java.util.*;

public class AllPrimesToN {
    public static List<Integer> enumeratePrimes(int n) {
        List<Integer> output = new ArrayList<>();
        if (n <= 1) {
            return new ArrayList<>();
        }

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                output.add(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(enumeratePrimes(1000));
    }
}
