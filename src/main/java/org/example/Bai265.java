package org.example;

import java.util.HashMap;
import java.util.Map;


public class Bai265 {
    public static void duplicateNumber(int[] ints, int[] ints1) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : ints) {
            map.put(i, 1);
        }
        for (int i : ints1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            if (map1.getValue() > 1) {
                System.out.print(map1.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints1 = {2, 2, 3, 3, 2, 4, 5, 6, 7, 8, 9, 10};
        duplicateNumber(ints, ints1);
    }
}
