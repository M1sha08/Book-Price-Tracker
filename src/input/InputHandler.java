package input;

import java.util.Scanner;
import java.util.List;

public class InputHandler {
    private final InputUtils inputUtils;

    public InputHandler(Scanner scanner) {
        this.inputUtils = new InputUtils(scanner);
    }

    public void showMenu() {
        System.out.println("Book-Price-Tracker by Mykhailo!");
        System.out.println("-------------------------------");

        System.out.println("1. Physical Book");
        System.out.println("2. E-Book");
        System.out.println("3. AudioBook");
        System.out.println("4. Exit");

        System.out.println("------------------");
    }

    public int askForOption() {
        return inputUtils.askForInt("Choose the type of book you're searching for: ");
    }

    public boolean isValidIntOption(int userOption, List<Integer> validOptions) {
        return validOptions.contains(userOption);
    }

    public void handleOption(int option) {
        switch (option) {
            case 1 -> System.out.println("Case 1");
            case 2 -> System.out.println("Case 2");
            case 3 -> System.out.println("Case 3");
        }
    }
}
