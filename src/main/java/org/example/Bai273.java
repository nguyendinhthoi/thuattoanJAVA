package org.example;

public class Bai273 {
    public static void eightNum(int num){
        int result = 0;
        int a = 1;
        while (num > 0){
            int b = num % 8;
            result = result + b * a;
            a = a * 10;
            num = num / 8;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        eightNum(55);
    }
}

