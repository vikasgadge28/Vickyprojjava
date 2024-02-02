package gfg;

import java.util.Scanner;

public class Print_Elements_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

      printArray(arr, n );

    }
  static void printArray(int arr[], int n) {
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i]);
      }
    }
}
