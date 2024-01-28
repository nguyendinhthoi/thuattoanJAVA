package org.example;

public class Bai271_112 {
    public static void findFibo(){
        int first = 0;
        int second = 1;
        System.out.print(first +", "+ second);
        int fibo = first + second;
        while (fibo < 100){
            System.out.print(", " + fibo);
            first = second;
            second = fibo;
            fibo = first + second;
        }
    }

    public static void main(String[] args) {
        findFibo();
    }
}
