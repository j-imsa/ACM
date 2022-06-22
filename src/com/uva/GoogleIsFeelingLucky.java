package com.uva;

import java.util.ArrayList;
import java.util.Scanner;

// 12015 - Google is Feeling Lucky
public class GoogleIsFeelingLucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        scanner.nextLine(); // ignore the \n in the EOL entered
        int cases = 1;
        while (testCase > 0) {

            int count = 10;
            int max = Integer.MIN_VALUE;
            ArrayList<String> websites = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                String url = scanner.next();
                int relevance = scanner.nextInt();
                if (relevance > max) {
                    max = relevance;
                    websites.clear();
                    websites.add(url);
                } else if (relevance == max) {
                    websites.add(url);
                }
            }

            System.out.printf("Case #%d:\n", cases++);
            for (int i = 0; i < websites.size(); i++) {
                System.out.println(websites.get(i));
            }

            testCase--;
        }
    }
}
