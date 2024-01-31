package Leetcode;

public class Que350 {
    public static void main(String[] args) {
        int arr[]= {4,9,5};
        int arr2[] ={9,4,9,8,4};
        for (int i = 0; i < arr2.length; i++) {
            int curr = arr2[i];
            for (int j = 0; j < arr.length; j++) {
                if(curr==arr[i])
                    arr2[i]=arr[i];
            }
            System.out.print(arr2[i]);
        }
    }
}
