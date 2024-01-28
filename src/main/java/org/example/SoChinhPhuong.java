package org.example;

public class SoChinhPhuong {
    public static boolean checkSoChinhPhuong(int num){
        int a = (int) Math.sqrt(num);
       return a * a == num;
    }

    public static void main(String[] args) {
        System.out.println(checkSoChinhPhuong(4));
    }
}
