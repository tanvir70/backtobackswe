package swe;

import java.util.Arrays;

public class DutchNationalFlagTwo {
    public static int[] sortedArray(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = 0;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, mid, left);
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, right);
                right--;
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 1, 2, 2, 2, 1, 0};
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(sortedArray(nums)));
    }
}
