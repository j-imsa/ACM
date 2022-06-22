package com.uva;

import java.util.Scanner;

// 11679 - Sub-prime
public class SubPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {

			int B = scanner.nextInt();
			int N = scanner.nextInt();
			if (B == N && B == 0) {
				break;
			}

			int[] monetaryReserves = new int[B];
			for (int i = 0; i < monetaryReserves.length; i++) {
				monetaryReserves[i] = scanner.nextInt();
			}

			for (int i = 0; i < N; i++) {
				int D = scanner.nextInt() - 1;
				int C = scanner.nextInt() - 1;
				int V = scanner.nextInt();

				monetaryReserves[D] -= V;
				monetaryReserves[C] += V;
			}

			boolean status = true;
			for (int i = 0; i < monetaryReserves.length; i++) {
				if (monetaryReserves[i] < 0) {
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println("S");
			} else {
				System.out.println("N");
			}

		}
	}
}
