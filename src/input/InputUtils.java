package input;

import java.util.Scanner;

public class InputUtils {
    private final Scanner scanner;

    public InputUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public int askForInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            }
            System.out.println("Please enter a valid number.");
            scanner.nextLine();
        }
    }

    public String askForString(String prompt, boolean isRequired) {
        String userText;
        while (true) {
            System.out.print(prompt);
            userText = scanner.nextLine();

            if (!isRequired) break;

            if (userText.isEmpty()) {
                System.out.println("Please enter required information.");
                continue;
            }
            break;
        }
        return userText;
    }

}
