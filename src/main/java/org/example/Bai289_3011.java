package org.example;

public class Bai289_3011 {
    public static void check(int[] ints) {
        int count;
        for (int i = 0; i < ints.length; i++) {
            count = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j] && i != j) {
                    count++;
                }
            }
            if (count < 1){
                System.out.println(ints[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 3, 1, 2, 1, 2, 4, 5, 6};
        check(ints);
    }
}
