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

            int maxSeniorIndex = maxSeniorIndex(scores);
            int maxSenior = scores[maxSeniorIndex];

            int minJunior = minJunior(scores, maxSeniorIndex);

            System.out.println(maxSenior - minJunior);

            testCase--;
        }
    }

    public static int maxSeniorIndex(int[] arr) {
        // ignore the last element
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int minJunior(int[] arr, int maxIndex) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i <= maxIndex) {
                continue;
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}
