package Leetcode;

public class Que2154 {
    public static int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]== original) {
                original = original <<1;
                        i=-1;
                }
            }
        return original;
        }
    public static void main(String[] args) {
        int [] nums = {8,19,4,2,15,3};
        int original = 2;
        System.out.println(findFinalValue(nums,original));
    }
}
