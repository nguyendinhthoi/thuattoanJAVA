package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class checkCharInString {
    public static List<Character> check(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    };
    public static void main(String[] args) {
        String str = "abdcef";
        String[] strings = str.split("");
        System.out.println(Arrays.toString(strings));
    }
}
