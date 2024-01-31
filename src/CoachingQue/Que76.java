package CoachingQue;

public class Que76 {
    public static void main(String[] args) {
        int arr[] = {23, 55,3,4,10,44,5,90};
        int tmp =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> tmp){
                tmp = arr[i];
            }
        }
        System.out.println(tmp);
    }
}
