import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 11078 - Open Credit System
public class OpenCreditSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase > 0) {

            int students = scanner.nextInt();
            int[] scores = new int[students];
            for (int i = 0; i < students; i++) {
                scores[i] = scanner.nextInt();
            }

            int maxSenior = maxSenior(scores);
            int maxJunior = maxJunior(scores);
            int minSenior = minSenior(scores);
            int minJunior = minJunior(scores);

            if (Math.abs(maxSenior - minJunior) > Math.abs(minSenior - maxJunior)) {
                System.out.println(maxSenior - minJunior);
            } else {
                System.out.println(minSenior - maxJunior);
            }

            testCase--;
        }
    }

    public static int maxSenior(int[] arr) {
        // ignore the last element
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxJunior(int[] arr) {
        // ignore the first element
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minSenior(int[] arr) {
        // ignore the last element
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minJunior(int[] arr) {
        // ignore the first element
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}
