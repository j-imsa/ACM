import java.util.Scanner;

// 12372 - Packing for Holiday
public class PackingForHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        int base = 20;
        int counter = 1;
        String result;

        while (testCase > 0) {

            // 1<=L;W;H<=50
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // ‘Case #:  good’ , ‘Case #:  bad’
            if (length > base || width > base || height > base) {
                result = "bad";
            }else {
                result = "good";
            }
            System.out.printf("Case %d: %s\n", counter++, result);

            testCase--;
        }
    }
}
