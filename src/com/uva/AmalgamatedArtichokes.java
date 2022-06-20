package com.uva;
import java.util.Scanner;

// 1709 - Amalgamated Artichokes
public class AmalgamatedArtichokes {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int n = scanner.nextInt();

            double[] prices = new double[n];
            for (int i = 0; i < n; i++) {
                prices[i] = p * (Math.sin(a * (i + 1) + b) + Math.cos(c * (i + 1) + d) + 2);
            }

            double max = prices[0];
            double decline = 0.0;
            for (int i = 1; i < prices.length; i++) {
                if (max - prices[i] > 0) {
                    if ((max - prices[i]) > decline) {
                        decline = max - prices[i];
                    }
                } else {
                    max = prices[i];
                }
            }

            System.out.printf("%.6f\n", decline);

        }

    }

}
