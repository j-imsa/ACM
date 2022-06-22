package com.uva;

import java.util.Scanner;

// 136 - Ugly Numbers
public class UglyNumbers {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);

		int uglyNumbercounter = 0;
		int index = 13;
		int end = 11;
		while (uglyNumbercounter != end) {
			index++;
			if (isUglyNumber(index)) {
				System.out.print(index + ", ");
				uglyNumbercounter++;
			}
		}
		System.out.printf("The 1500'th ugly number is %d.\n", index);
	}

	public static boolean isUglyNumber(int number) {
		if (number == 1) {
			return true;
		}
		if (isPrime(number)) {
			if (number == 2 || number == 3 || number == 5) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
