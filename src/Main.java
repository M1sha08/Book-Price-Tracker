
import input.InputHandler;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);

        while (true) {
            inputHandler.showMenu();
            int userOption = inputHandler.askForOption();

            if (!inputHandler.isValidIntOption(userOption, List.of(1,2,3,4))) {
                System.out.println("Invalid option!");
                System.out.println();
                continue;
            }
            if (userOption == 4) {
                System.out.println("Goodbye!");
                break;
            }
            inputHandler.handleOption(userOption);
        }

    }
}