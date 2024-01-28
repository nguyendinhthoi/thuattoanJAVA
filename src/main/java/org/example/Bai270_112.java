package org.example;

public class Bai270_112 {
    public static void reverseNum(int num){
        int reverseNum = 0;
        while (num > 0){
            int num1 = num % 10;
            reverseNum = reverseNum * 10 + num1;
            num /= 10;
        }
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        reverseNum(1523);
    }
}
