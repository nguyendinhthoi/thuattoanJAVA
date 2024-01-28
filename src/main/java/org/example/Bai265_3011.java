package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai265_3011 {
    //cách 1
//    public static void findNum(int[] ints, int[] ints1){
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int anInt : ints) {
//            map.put(anInt, map.getOrDefault(anInt, 0) + 1);
//        }
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            for (int j : ints1) {
//                if (entry.getKey() == j) {
//                    System.out.println(j);
//                }
//            }
//        }
//    }
    public static void findNum(int[] ints, int[] ints1){
        Map<Integer,Integer> map = new HashMap<>();
        for (int anInt : ints) {
            map.put(anInt, 1);
        }
        for (int j : ints1) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,5,7,0};
        int[] num1 = {1,3,7,8,9,0};
        findNum(num,num1);
    }
}
