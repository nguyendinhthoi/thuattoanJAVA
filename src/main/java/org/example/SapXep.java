package org.example;

public class SapXep {
    public static int[] sapXepOk(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j] && a[j] != -1 && a[i] != -1) {
                    int min = a[j];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {-1, 170, 190, 150, -1, -1, 160, 180};
        sapXepOk(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
