package org.example;

public class Bai285 {
    public static void find3ndMaxNum(int[] ints){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max1){
                max3 = max1;
                max2 = max3;
                max1 = ints[i];
            }
        }
    }
}
