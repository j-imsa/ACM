package com.uva;


import java.util.Scanner;
import java.util.stream.IntStream;

// 1585 - Score
public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();

        char correct = 'O';
        char wrong = 'X';
        while (testCase > 0) {
            String input = scanner.nextLine();
            input = wrong + input;
            int[] scores = new  int[input.length()];
            for (int i = 1; i < input.length(); i++) {
                scores[i] = 0;
                if (input.charAt(i) == correct) {
                    scores[i] += 1;
                    if (input.charAt(i-1) == correct) {
                        scores[i] += scores[i-1];
                    }
                }
            }
            System.out.println(IntStream.of(scores).sum());

            testCase--;
        }
    }
}
