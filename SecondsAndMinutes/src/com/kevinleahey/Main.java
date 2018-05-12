package com.kevinleahey;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(129, 42));
        System.out.println(getDurationString(3692));
        System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) System.out.println("Invalid value.");

        int totalSeconds = (minutes * 60) + seconds;
        int totalHours = totalSeconds / 3600;
        int totalMinutes = minutes % 60;

        return totalHours + "h " + totalMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) System.out.println("Invalid value.");

        int totalMinutes = seconds / 60;
        int newSeconds = seconds % 60;

        return getDurationString(totalMinutes, newSeconds);

    }
}
