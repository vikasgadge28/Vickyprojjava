package Codechef;

import java.util.Scanner;

public class Programming_Languages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            if(a==a1 || a==b1 && b ==a1 || b== b1)
                System.out.println(1);
            else if((a==a2 || a==b2) && (b==a2 || b==b2))
                System.out.println(2);
            else
                System.out.println(0);

        }
    }
}
