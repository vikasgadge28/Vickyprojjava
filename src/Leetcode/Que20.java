package Leetcode;

import java.util.Stack;

public class Que20 {
    int solve(int a, int b, int c) {
        // code here
        if((a>2* (b+c)+2) || (b>2 *(a+c)+2) || (c>2* (a+b)+2))
            return -1;
        return a+b+c;
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j=0;
        for (int e:pushed ) {
            st.push(e);
            while(st.size() > 0 && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return j == popped.length;
    }
    static int binarySearch(long arr[],int low, int high, long sum, long temp) {
        int mid, index=-1;
        long diff = Long.MAX_VALUE;
        while(low<=high) {
            mid= (low+high)/2;
            long first = arr[mid]-temp;
            long second = sum-arr[mid];
            if(Math.abs(first-second)<diff){
                diff=Math.abs(first-second);
                index=mid;
            }
            if(first < second) {
                low=mid+1;
            }
            else high=mid-1;
        }
        return index;
    }
}

