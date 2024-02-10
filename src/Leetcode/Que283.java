package Leetcode;

import java.util.Arrays;

public class Que283 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        moveZeroes(arr);
}

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = nums[i + 1];
                nums[i+1] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
