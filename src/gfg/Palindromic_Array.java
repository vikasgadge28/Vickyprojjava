package gfg;

import java.util.Scanner;

public class Palindromic_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(palinArray(arr,n));

    }

    public static int palinArray(int[] arr, int n)
    {
        for (int i = 0; i < arr.length; i++) {
            if(palindromenum(arr[i]) == 0)
         return 0;
        }
        return 1;
    }


    public static int palindromenum(int a ){
        int reverse  = 0;
        int temp = a;
        while (temp >0){
            int Lastnum = temp %10;
            reverse = reverse *10 +Lastnum;
            temp = temp/10;
        }
        if (a == reverse){
           return 1;
        }
        else
          return 0;
    }
}
