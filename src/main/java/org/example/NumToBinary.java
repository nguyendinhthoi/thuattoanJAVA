package org.example;

public class NumToBinary {
    public static void changeNum(int num){
        if (num == 0) {
            System.out.println("Binary representation: 0");
            return;
        }

        int binary = 0;
        int placeValue = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary = binary + remainder * placeValue;
            placeValue = placeValue * 10;
            num = num / 2;
        }
        System.out.println("Binary representation: " + binary);
    }
    public static void main(String[] args) {
        changeNum(52);
    }
}
