package Leetcode;

import java.util.Arrays;

public class Que9 {
    public static void main(String[] args) {

// in use of String..... program has run in n time
        int n = 121;
        String s = Integer.toString(n);
        int size = s.length()-1;
        for (int i = 0; i < s.length()>>1; i++) {
            if (s.charAt(i)!=s.charAt(size-i)) System.out.println("yes");
            else System.out.println("no");
        }

//      in way if Array :-
//        int x = 1224;
//        int tmp =0;
//        int arr[] = new int[(int) Math.log10(x)+1];
//        for (int i = 0; i < arr.length ; i++) {
//            tmp = x%10;
//            arr[i] = tmp;
//            x = x/10;}
//        for (int i = 0; i < arr.length/2; i++) {
//           if (arr[i]!=arr[arr.length-1-i])
//               System.out.println(false);
//           else
//               System.out.println(true);

        }
        }


