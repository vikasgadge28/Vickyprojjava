package Leetcode;

import java.util.Scanner;

public class Que2357 {
    public static int fac(int n){
        int fact = 1;
        for (int i = 0; i <= n; i++) {
          fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            fac(n);
    }
}
