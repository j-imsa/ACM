package com.uva;
import java.util.Scanner;

// 11044 - Searching for Nessy
public class SearchingForNessy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase > 0) {

            int rows = scanner.nextInt();
            int columns = scanner.nextInt();

            rows /= 3;
            columns /= 3;

            System.out.println(rows*columns);

            testCase--;
        }
    }

}
