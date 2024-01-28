package org.example;

public class Bai261 {
    public static int checkPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            return num;
        }else {
            return 0;
        }
    }
    public static int sumPrime(int[] arr){
        int sum = 0;
        for (int j : arr) {
           sum += checkPrime(j);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumPrime(arr));
    }
}
