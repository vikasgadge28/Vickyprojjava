package Codechef;

import java.util.Scanner;

public class Reach_fast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short y = s.nextShort();
        while (y-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int diff = Math.abs(a - b);

            if (diff == 0) System.out.println(0);
            else if (diff > c) {
                int k = 0;
                int ans = (diff / c) * c;
                while (ans < diff) {
                    ans += c;
                    k++;
                }
                System.out.println((diff / c)+k);
            }
            else System.out.println(1);
        }
    }
}
