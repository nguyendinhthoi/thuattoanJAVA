package org.example;

public class SoDauTrungSoCuoi {
    public static boolean checkSo(int num){
       String num1 = Integer.toString(num);
       char first = num1.charAt(0);
       char last = num1.charAt(num1.length() - 1);
       if (num1.length() == 1){
           return true;
       }else {
           if (first == last){
               return true;
           }else {
               return false;
           }
       }
    }
    public static void checkSoTrongKhoan(int num1 , int num2){
        for (int i = num1; i <= num2 ; i++) {
            if (checkSo(i)){
                System.out.println(i);
            }
        }
        System.out.println("no");
    }
    public static void main(String[] args) {
        checkSoTrongKhoan(9,13);
    }
}
