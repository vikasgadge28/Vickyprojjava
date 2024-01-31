package Leetcode;

import java.util.Arrays;

public class Que2469 {
    public static double[] convertTemperature(double celsius) {
        double arr[]= new double[2];
        arr[0] = celsius+273.15;
        arr[1] = celsius* 1.80 + 32.00;

        return arr;
        //new double[]{c + 273.15, c * 1.8 + 32.0}
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
}
