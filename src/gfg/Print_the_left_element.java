package gfg;

import java.util.Arrays;

public class Print_the_left_element {
    public static void main(String[] args) {
        long arr[] = {7, 8, 3, 4, 2, 9, 5};// 1 2 3 4 5 7 8 9
        int n = 7;
        System.out.println(leftElement(arr, n));

    }

    public static long leftElement(long arr[], long n)
    {
        long tmp = 0;
        Arrays.sort(arr);
        if(arr.length % 2 == 0)
            tmp = arr[(arr.length/2)-1];
        else
            tmp = arr[(arr.length/2)];

        return tmp;
    }
}
