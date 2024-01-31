package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Value_equal_to_index_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      System.out.print(valueEqualToIndex(arr, n));
    }

   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
       ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
       for (int i = 1; i <= n; i++) {
           if(arr[i]==i)
               arr1.add(arr[i]);


       }

        return arr1;
    }


}
