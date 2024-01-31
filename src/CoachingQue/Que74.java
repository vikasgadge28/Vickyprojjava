package CoachingQue;

import java.util.Scanner;

public class Que74 {
    public static void main(String[] args) {
        int arr[] = {2 ,9 ,72, 29,1009,3 };
        int tmp =0;
        int tmp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>tmp) {
                tmp = arr[i];
               tmp2 =i;
            }
        }
        System.out.println(tmp2);
        System.out.println(tmp);
    }
}
