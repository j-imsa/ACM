package com.uva;
import java.util.Scanner;

// 11332 - Summing Digits
public class SummingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(sumOfDigits(n));
        }
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
            if (n == 0 && sum > 9) {
                n = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
