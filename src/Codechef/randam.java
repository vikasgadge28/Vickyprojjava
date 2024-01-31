package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class randam {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t --> 0){
//         int n = sc.nextInt();
//         int b = sc.nextInt();
//             System.out.println(n*b );
//


        int  a = 1214;
        int reverse  = 0;
        int temp = a;
        while (temp >0){
            int Lastnum = temp %10;
            reverse = reverse *10 +Lastnum;
            temp = temp/10;
        }
        if (a == reverse){
           System.out.print("1");
        }
        else
            System.out.print("0");
    }
}