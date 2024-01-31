package CoachingQue;

import java.util.Scanner;

public class Que75 {
    public static void main(String[] args) {
        int arr[] = {45,6,677,66,7,65,7,8,5};
        int tmp =Integer.MAX_VALUE;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < tmp){
                tmp = arr[i];
                n =i;
            }
        }
        System.out.println(tmp+ "   "+ n);
    }
}
