package org.example;

import java.util.HashMap;
import java.util.Map;


public class Bai267 {
    public static void countInArray(String str){
        String[] strings = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i]) +1);
            }else {
                map.put(strings[i],1);
            }
        }
        for (Map.Entry<String,Integer> stringIntegerMap : map.entrySet()){
            System.out.println(stringIntegerMap.getKey() + " xuat hien " + stringIntegerMap.getValue() + " lan");
        }
    }

    public static void main(String[] args) {
        String str = "toi cam thay toi te";
        countInArray(str);
    }
}
