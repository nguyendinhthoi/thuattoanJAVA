package org.example;

public class Bai277 {
    public static void findMax2ndNum(int[] num){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max1){
                max2 = max1;
                max1 = num[i];
            } else if (max2 < num[i] && num[i] < max1) {
                max2 = num[i];
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        int[] ints= {1,2,3,4,4,5,5,5};
        findMax2ndNum(ints);
    }

}
