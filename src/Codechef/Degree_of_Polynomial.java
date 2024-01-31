package Codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Degree_of_Polynomial {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            if((arr[i]-arr[i+1])!=0)
                arrayList.add(arr[i] );
           else if((arr[i]-arr[i+1])==0)
                arrayList.remove(arr[i]);

        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int arr[]= {4, 2, -2, 1};
        System.out.println(makeBeautiful(arr));
    }
    }

