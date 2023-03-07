package swe;

import java.util.Arrays;
public class DutchNationalFlag {
    public static int[] sortedArray(int[] nums) {

        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] == 1) {
                countOne++;
            }
            if (nums[i] == 2) {
                countTwo++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < countZero) {
                nums[i] = 0;
            } else if (i < (countOne + countZero)) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,1,2,2,2,1,0};
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(sortedArray(nums)));
    }
}
