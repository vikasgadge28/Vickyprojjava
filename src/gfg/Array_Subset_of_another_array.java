package gfg;

public class Array_Subset_of_another_array {
    public static void main(String[] args) {
       long  a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
       long  a2[] = {11, 3, 8, 1, 7};
       int n = 8;
       int m = 5;
        System.out.println(isSubset(a1, a2, n, m ));

    }
    public static String isSubset( long a1[], long a2[], long n, long m) {
        int tmp =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                if(a2[i] == a1[j])
                tmp++;
            }
            if (tmp == m)
                return "Yes";
        }
       return "No" ;
    }
}
