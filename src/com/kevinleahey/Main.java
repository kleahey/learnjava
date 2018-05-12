package com.kevinleahey;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes - (megabytes * 1024);

        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
        } else {
            System.out.print(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }

}

