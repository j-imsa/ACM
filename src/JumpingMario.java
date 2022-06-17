import java.util.Scanner;

// 11764 - Jumping Mario
public class JumpingMario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        int counter = 1;
        int high;
        int low;

        while (testCase > 0) {

            int length = scanner.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            high = 0;
            low = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    high++;
                }
                if (arr[i] > arr[i + 1]) {
                    low++;
                }
            }

            System.out.printf("Case %d: %d %d\n", counter++, high, low);
            testCase--;
        }
    }
}
