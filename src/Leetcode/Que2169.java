package Leetcode;

public class Que2169 {
    public static void main(String[] args) {
        int n = 5;
        int v = 4;
        int temp = 0;
        while (n > 0 && v > 0){
            if (n >= v) n = n - v;
                else v = v - n;
                    temp++;
        }
        System.out.println(temp);
        // returm temp;
    }
}
