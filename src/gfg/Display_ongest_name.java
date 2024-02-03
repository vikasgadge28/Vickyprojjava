package gfg;

public class Display_ongest_name {
    public static void main(String[] args) {
        int n = 5;
       String names[] = { "Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longest( names, 5));


    }
      static  String longest(String names[], int n) {
        int tmp = Integer.MIN_VALUE;
        String Longest = null;
        int i = 0 ;
         while (n > i){
           if(names[i].length() > tmp){
               tmp = names[i].length();
               Longest = names[i];
               i++;
           }
           else
               i++;
          }
         return Longest;
    }
}
