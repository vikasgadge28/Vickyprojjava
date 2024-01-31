package Leetcode;

public class Que2293 {
    public static void main(String[] args) {
        int nums[] = {1,4,5,2,4,8,2,2};
        while(nums.length>1){
            int n = nums.length;
            int[] newNums = new int[n/2];
            for(int i =0;i<newNums.length;i++){
                newNums[i]= (i%2==0)?Math.min(nums[2*i],nums[2*i+1]):Math.max(nums[2*i],nums[2*i+1]);
            }
            nums = newNums;
        }
        System.out.println(nums[0]);
        }
    }

