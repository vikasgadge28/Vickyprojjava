package gfg;

public class Find_the_Non_repeating_element {
    public static void main(String[] args) {
        int arr [] = {6,6,6,6,7};

        System.out.println(print(arr));
    }

    public static int print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int count =0; // -1 2 -1 4

            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                    count++;
                if(count==2) {
                    break;
                }
            }
            if(count==1) {
              return arr[i];
            }

        }
    return 0;
    }

}
