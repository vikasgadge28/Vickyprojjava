package gfg;

import java.util.Arrays;

public class At_least_two_greater_elements {
    public static void main(String[] args) {

        long arr[] = {2, 8 ,7 ,1, 5};
        int n = 5;
        System.out.println(Arrays.toString(findElements(arr, n)));
    }

    public static long[] findElements( long a[], long n)
    {
        Arrays.sort(a);
        long arr[] = new long[a.length-2];
        for (int i = 0; i < n-2; i++) {
            arr[i] = a[i];
        }
        return arr;
    }
}
