package com.uva;
import java.util.Scanner;

// 11614 - Etruscan Warriors Never Play Chess
public class EtruscanWarriorsNeverPlayChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();


        while (testCase > 0) {

            long warriors = scanner.nextLong();

            System.out.println((long) Math.floor(0.5 + Math.sqrt(2.0 * warriors + 0.25)) - 1);

            testCase--;
        }
    }

}
