package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai262 {
    public static void checkCharNum(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = s.split("");
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }
    }

    public static void main(String[] args) {
        String s = "aabacsdc";
        checkCharNum(s);
    }
}
