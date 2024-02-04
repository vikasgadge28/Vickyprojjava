package Leetcode;

public class Que1450 {
    public static void main(String[] args) {
        int [] arr = {4};
        int [] arr2 = {4};
        busyStudent(arr,arr2, 5);

        System.out.println(  busyStudent(arr,arr2, 4));
    }


    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int tmp =0;
        for (int i = 0; i < startTime.length ; i++) {
            if(queryTime >= startTime[i]  &&  queryTime <=endTime[i])
                tmp++;
        }
        return tmp;
    }
}
