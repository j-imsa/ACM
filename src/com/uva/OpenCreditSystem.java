package com.uva;
import java.util.Scanner;

// 11078 - Open Credit System
public class OpenCreditSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase > 0) {

            int students = scanner.nextInt();
            int[] scores = new int[students];
            for (int i = 0; i < students; i++) {
                scores[i] = scanner.nextInt();
            }

            int pointA = scores[0];
            int deference = Integer.MIN_VALUE;
            for (int i = 1; i < scores.length; i++) {
                int pointB = scores[i];
                if (pointA - pointB > deference) {
                    deference = pointA - pointB;
                }
                if (pointB > pointA) {
                    pointA = pointB;
                }
            }

            System.out.println(deference);

            testCase--;
        }
    }

}
