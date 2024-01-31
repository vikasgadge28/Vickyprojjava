package CoachingQue;

import java.util.Scanner;

public class Que73 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int arr[] = {10,38 ,39,50, 34,9};
        int tmp =0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        tmp = tmp/ arr.length;
        System.out.println(tmp);
    }
}
