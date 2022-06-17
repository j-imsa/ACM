import java.math.BigInteger;
import java.util.Scanner;

// 11687 - Digits
public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            BigInteger x0 = new BigInteger(input);
            int count = 1;
            while (true) {
                BigInteger x1 = new BigInteger(String.valueOf(x0.toString().length()));
                if (x0.equals(x1)) {
                    System.out.println(count);
                    break;
                }
                BigInteger x2 = new BigInteger(String.valueOf(x1.toString().length()));
                if (x1.equals(x2)) {
                    System.out.println(count+1);
                    break;
                }
                count++;
                x0 = x1;
            }
        }
    }
}
