package Leetcode;

public class Que169 {
    public static int majorityElement(int[] nums) {
        int ans = 0; int count =1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[ans])
                count++;
            else count--;
            if(count==0){ans=i;
                count=1;}}
        count=0;
        for (int i = 0; i < nums.length; i++)
            if(nums[ans]==nums[i])
                count++;
            if(nums[ans]<=nums.length/2)
                return -1;
        else  return nums[ans];
    }
    public static void main(String[] args) {
        int arr[]= {1,1,1,2,2,5};
        System.out.println(majorityElement(arr));
    }
}
