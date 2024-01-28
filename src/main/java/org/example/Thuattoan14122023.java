package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Thuattoan14122023 {
    public static void timChuoiTrungLap(String s){
        Map<String,String> map = new TreeMap<>();
        String[] strings = s.split("");
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string,String.valueOf(Integer.parseInt(map.get(string))+1));
            } else {
                map.put(string, "1");
            }
        }
        String[][] strings1 = new String[map.size()][2];
        int i = 0;
        for (Map.Entry<String,String> entry : map.entrySet()){
            strings1[i][0] = entry.getValue();
            strings1[i][1] = entry.getKey();
            System.out.println(strings1[i][0] + "," + strings1[i][1]);

            i++;
        }
    }

    public static void main(String[] args) {
        timChuoiTrungLap("aabacsdc");
    }
}
