package gfg;

import java.util.Arrays;

public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        long A[] = {1,2,5,4,0};
         long B[] = {2,4,5,0,1};
         int n =5;
         System.out.print(check(A,B,n));

    }
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            if(A[i] != B[i])
                return false;
        }
        return true;
    }
}
