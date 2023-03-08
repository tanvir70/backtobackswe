package swe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblemOpt {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                if (nums[i] > 0) break;
                int left = i + 1, right = nums.length - 1, sum = -nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {-3, -1, 1, 0, 2, 10, -2, 8};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}


