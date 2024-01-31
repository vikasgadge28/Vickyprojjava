package Codechef;

public class Aarrysearch {
    public static int Arraymax(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,5,7,8,10,15};
        System.out.println(Arraymax(arr,8));
    }
}
