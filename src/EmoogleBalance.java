import java.util.Scanner;

// 12279 - Emoogle Balance
public class EmoogleBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int emoogleBalance = 0;
        while (true) {
            int length = scanner.nextInt();
            if (length == 0) {
                break;
            }
            int arr[] = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            emoogleBalance = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    emoogleBalance--;
                } else {
                    emoogleBalance++;
                }
            }

            System.out.printf("Case %d: %d\n", counter++, emoogleBalance);
        }
    }
}
