package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class Find_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a [i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.print(Arrays.toString(findIndex(a,N, key)));
    }

    static int[] findIndex(int a[], int N, int key)
    {
      int arr[] = {-1 , -1 };

        for (int i = 0; i < N; i++) {
            if(a[i] == key) {
               arr[0] = i;
                break;
            }
        }
        for (int i = N-1; i >=0 ; i--) {
            if(a[i] == key) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
