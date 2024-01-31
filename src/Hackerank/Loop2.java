package Hackerank;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int c = a;
            for (int j = 0; j < n; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }
            sc.close();


        }
    }}
