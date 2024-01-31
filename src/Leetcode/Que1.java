package Leetcode;


import java.util.Arrays;

public class Que1 {
    public  static int[] twoSum(int[] nums, int target) {
        int []a = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    a[0] = i;
                    a[1]=j;
                }
            }
        }
return a;
    }
    public static void main(String[] args) {

        int[]a = {1,23,4,4,56};
        System.out.println(Arrays.toString(twoSum(a,5)));

    }
}



