package org.example;

public class Bai270 {
    public static int reverseNum(int num) {
        int reverseNumber = 0;
        while (num != 0) {
           int number = num % 10;
           reverseNumber = reverseNumber * 10 + number;
           num/=10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(12345));
    }
}
