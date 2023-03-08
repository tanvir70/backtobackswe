package swe;

import java.util.*;

public class ThreeSumProblemBrute {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        Set<Integer> set = new TreeSet<>();
                        set.add(nums[i]);
                        set.add(nums[j]);
                        set.add(nums[k]);
                        List<Integer> list = new ArrayList<>(set);
                        output.add(list);
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
