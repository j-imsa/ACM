package com.uva;
import java.util.Scanner;

// 11547 - Automatic Answer
public class AutomaticAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase > 0) {
            int skill = scanner.nextInt();

            skill *= 567;
            skill /= 9;
            skill += 7492;
            skill *= 235;
            skill /= 47;
            skill -= 498;

            String result = String.valueOf(skill);
            System.out.println(result.substring(result.length()-2, result.length()-1));

            testCase--;
        }
    }
}
