package gfg;

import java.util.Scanner;

public class Print_alternate_elements_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
          print(arr, n);
    }

    public static void print(int arr[], int n)
    {
        for (int i = 0; i <= n; i= i+2) {
            System.out.print(arr[i] + " ");
        }
    }
}
