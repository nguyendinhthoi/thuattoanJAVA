package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai267_3011 {
    public static void countArr(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }
    }

    public static void main(String[] args) {
        String[] strings = {"toi","thay","thich","toi"};
        countArr(strings);
    }
}
