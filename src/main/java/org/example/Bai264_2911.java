package org.example;

import java.util.Arrays;

public class Bai264_2911 {
    public static void sapXepChuoi(String s){
        String[] chars = s.split("");
        String temp;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i].compareTo(chars[j]) > 0){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(chars));
    }

    public static void main(String[] args) {
        sapXepChuoi("bafed");
    }
}
