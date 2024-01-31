package Leetcode;

import java.util.Arrays;

public class Que704 {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                return mid;
            if(target<nums[mid])
                end = mid-1;
            else
                start= mid+1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int  [] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println( search(nums,target));
    }
}
