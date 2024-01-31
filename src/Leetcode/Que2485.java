package Leetcode;

public class Que2485 {
    public int pivotInteger(int n) {
        for (int i = 1; i < n; i++) {
            int left = (i*(i+1))/2;
            int ringt = (n*(n+1))/2-(i*(i-1))/2;
            if(left==ringt) {
                return 1;
            }

    }
        return -1;
    }

    public static void main(String[] args) {
        int n =8;
        for (int i = 1; i < n; i++) {
            int left = (i*(i+1))/2;
            int ringt = (n*(n+1))/2-(i*(i-1))/2;
            if(left==ringt)
                return;
        }
    }
}
