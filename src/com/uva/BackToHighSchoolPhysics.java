package com.uva;
import java.util.Scanner;

// 10071 - Back to High School Physics
public class BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(2 * scanner.nextInt() * scanner.nextInt());
        }
    }
}
