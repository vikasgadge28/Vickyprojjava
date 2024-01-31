package CoachingQue;

import java.util.Arrays;
import java.util.Scanner;

public class Que72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            tmp += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(tmp);
    }
}
