package org.example;

public class Bai284 {
    public static void swapTwoInstance(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : "+ a + " b : " + b );
    }

    public static void main(String[] args) {
        swapTwoInstance(3,4);
    }
}
