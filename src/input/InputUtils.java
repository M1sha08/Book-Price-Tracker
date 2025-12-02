package input;

import java.util.Scanner;
import java.lang.Integer;

public class InputUtils {
    private final Scanner scanner;

    public InputUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public int tryReadInt(String prompt) {
        System.out.print(prompt);

        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        }

        scanner.nextLine();
        return Integer.MIN_VALUE;
    }

    public int askForInt(String prompt) {
        while (true) {
            int value = tryReadInt(prompt);
            if (value != Integer.MIN_VALUE) return value;

            System.out.println("Please enter a valid number.");
        }
    }

    public String askForString(String prompt, boolean isRequired) {
        while (true) {
            System.out.print(prompt);
            String userText = scanner.nextLine();

            if (!isRequired || userText.isEmpty()) {
                return userText;
            }

            System.out.println("Please enter required information.");
        }
    }

}
