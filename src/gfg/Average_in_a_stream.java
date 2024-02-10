package gfg;

import java.util.Arrays;

public class Average_in_a_stream {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int n = 5;
        System.out.println(Arrays.toString(streamAvg(arr, n)));

    }

    static float[] streamAvg(int[] arr, int n) {
        // code here
        float tmp =0;
        float tmp2 =1;
        float a[] = new float[n];
        for (int i = 0; i < n; i++) {
            tmp = arr[i] + tmp;
            a[i] = tmp/tmp2;
            tmp2++;
        }
        return a;
    }
}
