package gfg;

public class Compete_the_skills {
    public static void main(String[] args) {

        long [] arr ={4,2,7};
        long [] arr1 ={5, 6, 3};
        scores(arr,arr1);
    }



    public static void scores(long a[], long b[]) {
        int ca =0;
        int cb =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > b[i])
                ca++;
          else   if(a[i] < b[i] )
                cb++;

        }

    }
}
