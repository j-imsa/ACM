package com.uva;
import java.util.Scanner;

// 100 The 3n + 1 problem
public class The3nPlus1Problem {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			int start = first, end = second;
			if (start > end) {
				start = start + end;
				end = start - end;
				start = start - end;
			}
			int maxLength = cycleLengthCalculator(start);
			for (int i = start+1; i <= end; i++) {
				int len = cycleLengthCalculator(i);
				if (len > maxLength) {
					maxLength = len;
				}
			}
			System.out.printf("%d %d %d\n", first, second, maxLength);
		}
	}
	public static int cycleLengthCalculator(int n) {
		int count = 1;
		while (n != 1) {
			if (n%2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			count++;
		}
		return count;
	}
}
