package gfg;

import java.util.Arrays;

public class power_of_2 {
    public static int countSpecialNumbers(int N, int arr[]) {
        // Code here
        int max = arr[0];
        for (int i = 0; i <N ; i++) {
            max = Math.max(arr[i], max);
        }
        int special[] = new int[max+1];
        Arrays.fill(special,0);
        for (int i = 0; i < N; i++) {
            if(special[arr[i]]<2){
                for (int j = 0; j <= max; j+=arr[i]) {
                    special[j]++;
                }
            }
        }
        int ans =0;
        for (int x : arr) {
            if(special[x]>1)
                ans++;
        }
            return ans;
        }


    public static void main(String[] args) {
        int[] ar = {5,5,5,5};
        System.out.println((countSpecialNumbers(4, ar)));
    }

}
