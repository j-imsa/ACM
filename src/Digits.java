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

            String x0 = input;
            int count = 1;
            while (true) {
            	String x1 = String.valueOf(x0.length());
                if (x0.equals(x1)) {
                    System.out.println(count);
                    break;
                }
                String x2 = String.valueOf(x1.length());
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
