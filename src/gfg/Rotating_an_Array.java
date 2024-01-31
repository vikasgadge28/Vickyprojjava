package gfg;

import java.util.Arrays;

public class Rotating_an_Array {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int k = 2;

        if (k> arr.length) k = k% arr.length;
        for (int j = 0; j < k; j++) {
            int t = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }arr[arr.length-1] = t;
        }
//        if (k> arr.length) k = k% arr.length;
//        for (int j = 0; j < k; j++) {
//            int t = arr[0];
//            for (int i = 0; i < arr.length-1; i++) {
//                arr[i] = arr[i+1];
//            }arr[arr.length-1] = t;
//        }
//        System.out.println(Arrays.toString(a));
    }
}
