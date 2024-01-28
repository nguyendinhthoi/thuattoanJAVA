package org.example;

public class SoHoanHao {
    public static boolean checkPerfectNum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNum(28));
    }
}
