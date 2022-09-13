package BacktoBackSwe;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class The3SumProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a array size: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter integer values for the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array : " + Arrays.toString(array));
        System.out.print("What Triplets sum u want ? : ");
        int sum = scan.nextInt();
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n; k++) {
                    if (array[i] + array[j] + array[k] == sum) {
                        System.out.println("The 3-Sum is : " + array[i] + " + " + array[j] + " + " + array[k] + " = " + sum);
                        break;
                    }
                }
            }
        }
    }
}
