package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai266_3011 {
    public static void countString(String s){
        Map<String,Integer> map = new HashMap<>();
        String[] strings = s.split("\\s+");
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }
    }

    public static void main(String[] args) {
        countString("toi la toi thich nhu vay, thich the toi");
    }
}
