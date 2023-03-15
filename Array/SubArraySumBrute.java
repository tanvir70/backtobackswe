package swe.Array;

public class SubArraySumBrute {
    public static int countSubArray(int[] array, int k) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                 sum += array[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 1};
        System.out.println(countSubArray(array,0));
    }
}
