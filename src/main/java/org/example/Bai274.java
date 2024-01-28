package org.example;

public class Bai274 {
    public static String sumTimes(String time1, String time2) {
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");

        int h1 = Integer.parseInt(parts1[0]);
        int m1 = Integer.parseInt(parts1[1]);
        int s1 = Integer.parseInt(parts1[2]);

        int h2 = Integer.parseInt(parts2[0]);
        int m2 = Integer.parseInt(parts2[1]);
        int s2 = Integer.parseInt(parts2[2]);

        int totalSeconds = s1 + s2 + (m1 + m2) * 60 + (h1 + h2) * 3600;

        int totalHours = totalSeconds / 3600;
        totalSeconds %= 3600;

        int totalMinutes = totalSeconds / 60;
        totalSeconds %= 60;

        return String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSeconds);
    }

    public static void main(String[] args) {
        String time1 = "11:20:30";
        String time2 = "07:35:45";
        String sum = sumTimes(time1, time2);
        System.out.println(sum);
    }
}
