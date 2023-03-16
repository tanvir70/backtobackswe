package swe.Array;

import java.util.HashMap;

public class SubArraySumOpt {
    public static int countSubArray(int[] array, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 1};
        System.out.println(countSubArray(array, 0));
    }
}
