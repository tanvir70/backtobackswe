package swe;

import java.util.*;

public class ThreeSumProblemBrute {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }

    public static void main(String[] args) {
        int[] nums = {-3, -1, 1, 0, 2, 10, -2, 8};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
