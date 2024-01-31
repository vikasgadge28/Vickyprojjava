package Codechef;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Recent_contest_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while (t-->0){
        int a = sc.nextInt();
            String arr[] = new String[a];
           for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.next();
           }
            int b = 0;
            int c =0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals("START38"))
                    b++;
                else
                    c++;
            }
            System.out.println(b + " "+ c);
        }
    }
}