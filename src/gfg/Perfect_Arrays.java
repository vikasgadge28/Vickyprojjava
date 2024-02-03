package gfg;

public class Perfect_Arrays {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 2,1};
        int n = 5;
        System.out.println(IsPerfect(arr, n));

    }

    public static boolean IsPerfect(int a[], int n)
    {
        for (int i = 0; i < n/2; i++) {
            if(a[i] != a[n-1-i])
              return false;

        }
        return true;
    }
}
