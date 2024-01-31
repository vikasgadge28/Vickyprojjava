package Codechef;

import java.util.Scanner;

public class Practice_makes_us_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=10)
                c++;
        }
        System.out.println(c);

    }
}
