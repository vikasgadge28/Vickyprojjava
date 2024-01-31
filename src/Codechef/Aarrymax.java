package Codechef;

import java.util.HashMap;

public class Aarrymax {
    public static void main(String[] args){
        int []arr = {1,5,7,8,15,10};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
             }  System.out.println(max);

        }
    }

