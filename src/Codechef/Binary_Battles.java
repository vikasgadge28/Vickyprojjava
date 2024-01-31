package Codechef;

import java.util.Scanner;

public class Binary_Battles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int C = 0;
        while (t-->0) {

            int N = 20;
            short A = sc.nextByte();
            short B = sc.nextByte();

            while (N > 1) {
                C++;
                N = N / 2;
                System.out.println((((C * A) + (C - 1) * B)));
            }
            int a =  3455;


            System.out.println((int)Math.log10(a)+1);
        }}
}
