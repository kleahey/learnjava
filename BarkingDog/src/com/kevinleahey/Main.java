package com.kevinleahey;

public class Main {

    public static void main(String[] args) {

        System.out.println(bark(true, 3));

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if (hourOfDay < 0 || hourOfDay > 23) return false;

        if (barking == true && hourOfDay < 8) {
            wakeUp = true;
        } else if (barking == true && hourOfDay > 22) {
            wakeUp = true;
        }

        return wakeUp;
    }
}
