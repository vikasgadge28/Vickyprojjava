package Codechef;

import java.util.Arrays;

public class Que169 {
    public static void main(String[] args) {
        int []arr = {5,1,4,1,1};
        int carr =0;
        int cont=0;
        for (int i = 1; i < arr.length; i++) {
            carr = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if(carr==arr[j])
                    cont++;

            }
            System.out.println(cont);
        }
    }
    }
