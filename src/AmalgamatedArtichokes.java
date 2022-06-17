import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

            int maxIndex = findMaxIndex(prices);
            int minIndexAfterMax = findMinIndexAfterMax(prices, maxIndex);
            double maxToMin = prices[maxIndex] - prices[minIndexAfterMax];

            int minIndex = findMinIndex(prices);
            int maxIndexBeforeMin = findMaxIndexBeforeMin(prices, minIndex);
            double minToMax = prices[maxIndexBeforeMin] - prices[minIndex];

            if (maxToMin > minToMax) {
                System.out.printf("%.6f\n", maxToMin);
            } else {
                System.out.printf("%.6f\n", minToMax);
            }


        }

    }

    public static int findMaxIndex(double[] arr) {
        double max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndexAfterMax(double[] arr, int maxIndex) {
        double min = arr[maxIndex];
        int minIndex = maxIndex;
        for (int i = maxIndex; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMinIndex(double[] arr) {
        double min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndexBeforeMin(double[] arr, int minIndex) {
        double max = arr[minIndex];
        int maxIndex = minIndex;
        for (int i = 0; i < minIndex; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
