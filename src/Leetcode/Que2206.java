package Leetcode;

import java.util.Arrays;

public class Que2206 {
    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i] != nums[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums []=  {3,2,3,2,2,2};
        System.out.println(nums.length);
        System.out.println(divideArray(nums));
    }
}
