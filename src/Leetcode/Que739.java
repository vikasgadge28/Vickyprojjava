package Leetcode;

public class Que739 {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while (arr[j]>arr[i]){
                if(arr[j]>arr[i])
                    count++;
                i++;
            }
            arr[i]=count;
            System.out.print(count);
        }
    }
}
