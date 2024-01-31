package Codechef;

public class helloene {
    public static void main(String[] args) {
        int []arr = {0, 3,0,5};
        int current = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) current = Math.max(current,i);



        }
        System.out.println(current);
    }
}
