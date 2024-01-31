package gfg;

import java.util.Arrays;

public class Make_Array_Elements_Equal {
    public static int remainder(String str){
        int len = str.length();

        int num= 0;
              int   rem = 0;
        for (int i = 0; i < len; i++) {
            num = rem * 10 + (str.charAt(i) - '0');
            rem = num % 11;
        }

        return rem;
    }
    public static void main(String[] args) {
        System.out.println(remainder("3878750872057057"));

    }
}


