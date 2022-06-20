package com.uva;
import java.util.Arrays;
import java.util.Scanner;

// 11799 - Horror Dash
public class HorrorDash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int counter = 1;
        while (testCase > 0) {

            int length = scanner.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            System.out.printf("Case %d: %d\n", counter++, arr[arr.length - 1]);
            testCase--;
        }
    }
}
