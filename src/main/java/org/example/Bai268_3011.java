package org.example;

public class Bai268_3011 {
    public static void reverseNum(int num) {
        int reverseNum = 0;
        while (num > 0) {
            int a = num % 10;
            reverseNum = reverseNum * 10 + a;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        reverseNum(123456789);
    }
}
