package Leetcode;

import java.util.Arrays;

public class Que283 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12,0};
        moveZeroes(arr);

}

    public static void moveZeroes(int[] nums) {
        int tmp =0;
        int a = nums.length;
        for (int i = 0; i < a; i++) {
            if(nums[i] != 0){
                nums[tmp] = nums[i];
                tmp++;
            }
        }
        for (int i = tmp; i < nums.length ; i++) {
            nums[tmp++] =0;
        }

        System.out.println(Arrays.toString(nums));

    }
}
