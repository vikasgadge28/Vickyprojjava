package gfg;

import java.util.Scanner;

public class Count_of_smaller_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.print(countOfElements(arr, n , x));

    }

    public static int countOfElements(int []arr,int n,int x)
    {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x){
                temp++;

            }

        }
        return temp;
    }

}
