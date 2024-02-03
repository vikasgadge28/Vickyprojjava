package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_kth_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a [i] = sc.nextInt();
        }
      swapKth(a , N, k);
    }

   static void swapKth(int arr[], int n, int k) {
        int tmp =  arr[n-k];
       arr[n-k] =  arr[k-1] ;
       arr[k-1] =tmp;

    }
}
