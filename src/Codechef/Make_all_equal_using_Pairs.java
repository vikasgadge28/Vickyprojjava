package Codechef;

import java.util.Scanner;

public class Make_all_equal_using_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int lenth = sc.nextInt();
            int arr[] = new int[lenth];
            int count = 0;
            int a1 = 0, a2 = 0, a3 = 0;
            for (int i = 0; i < arr.length; i++) {
                //1 2 3
                arr[i] = sc.nextInt();
                if(arr[i]>a1){
                    arr[i] = a1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}