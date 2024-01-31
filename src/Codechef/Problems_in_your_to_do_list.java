package Codechef;

import java.util.Scanner;

public class Problems_in_your_to_do_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
        int c = 0;
        int arrlenth = sc.nextInt();
        int [] arr = new int[arrlenth];
        for (int i = 0; i < arrlenth; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arrlenth; i++) {
            if(arr[i]>= 1000)
                c++;
        }
        System.out.println(c);}
    }

}
