package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai266 {
    public static void countWord(String strings) {
        String[] strings1 = strings.split("\\s+");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : strings1) {
            stringIntegerMap.put(s, stringIntegerMap.getOrDefault(s, 0) + 1);
        }
        stringIntegerMap.forEach((key, value) -> System.out.println(key + " xuat hien " + value + " lan"));
    }

    public static void main(String[] args) {
        String s = "toi la toi thich toi la duoc thich roi";
        countWord(s);
    }
}
