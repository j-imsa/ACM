package com.uva;
import java.util.Scanner;

// 11172 - Relational Operator
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase > 0) {

            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (first > second) {
                System.out.println(">");
            } else if (first < second) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }


            testCase--;
        }

    }
}
