package Leetcode;

public class Que70 {
    public static int climbStairs(int n) {
if(n==1)
    return 1;
if (n==2)
    return 2;
int tmp =0;
int step=2;
int step2 =1;
        for (int i = 3; i <=n ; i++) {
            tmp = step+step2;
           step2 = step;
           step= tmp;

        }
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(8));
    }
}

