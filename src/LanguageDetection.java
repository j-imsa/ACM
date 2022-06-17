import java.util.Scanner;

// 12250 - Language Detection
public class LanguageDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String EXIT = "#";
        int testCaseCounter = 1;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals(EXIT)) {
                break;
            }
            String result;
            switch (line) {
                case "HELLO": result = "ENGLISH"; break;
                case "HOLA": result = "SPANISH"; break;
                case "HALLO": result = "GERMAN"; break;
                case "BONJOUR": result = "FRENCH"; break;
                case "CIAO": result = "ITALIAN"; break;
                case "ZDRAVSTVUJTE": result = "RUSSIAN"; break;
                default: result = "UNKNOWN";
            }

            System.out.printf("Case %d: %s\n", testCaseCounter++, result);
        }
    }
}
