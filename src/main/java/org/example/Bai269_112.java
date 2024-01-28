package org.example;

public class Bai269_112 {
    public static void sumMin(int[] ints){
        int max = ints[0];
        int min = ints[0];
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
            if (anInt > max) {
                max = anInt;
            } else {
                min = anInt;
            }
        }
        int sumFourMin = sum - max;
        int sumFourMax = sum - min;

        System.out.println("tong 4 so nho nhat la " + sumFourMin );
        System.out.println("tong 4 so lon nhat la " + sumFourMax );
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5} ;
        sumMin(ints);
    }
}
