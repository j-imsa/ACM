import java.util.Scanner;

// 10424 - Love Calculator
public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String firstName = scanner.nextLine();
            String secondName = scanner.nextLine();

            int firstNameValue = getValueOfName(firstName);
            int secondNameValue = getValueOfName(secondName);

            firstNameValue = getSumOfInteger(firstNameValue);
            secondNameValue = getSumOfInteger(secondNameValue);

            float aliKhajeh = (secondNameValue / (float) firstNameValue) * 100;
            float khajehAli = (firstNameValue / (float) secondNameValue) * 100;

            float result = Math.min(aliKhajeh, khajehAli);
            if (result > 100f) result = 100f;
            System.out.printf("%.2f %s%n", result, "%");

        }

    }

    private static int getValueOfName(String name) {
        name = name.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int returnValue = 0;
        for (int i = 0; i < name.length(); i++) {
            returnValue += (name.charAt(i) - 'a' + 1);
        }
        return returnValue;
    }

    private static int getSumOfInteger(int value) {
        int sum = 0;
        while (value != 0) {
            sum += (value % 10);
            value /= 10;
            if (value == 0 && sum > 9) {
                value = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
