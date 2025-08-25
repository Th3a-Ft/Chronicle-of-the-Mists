import java.util.Scanner;

/**
 * Display various messages & display the menu at the beginning of the game
 */
public class Menu {
    /**
     * Display all the messages
     *
     * @param message : message to display
     */
    public static void message(String message) {
        System.out.println(message);
    }

    /**
     * Choose the character and display all the information about it
     * The player can name his character and update the info about his character
     * return object Character
     */
    public static Character createCharacter() {
        Scanner input = new Scanner(System.in);
        while (true) {
            message("You can close the game at any time by tipping \"exit\"");
            message("Choose your character: (type you choice)");
            message("Witcher or Warrior");

            String characterChoice = exitGame(input);


            if (characterChoice.equals("Witcher")) {
                message("You choose to become a Witcher");
            } else {
                message("You choose to become a Warrior");
            }
            message("You choose to be a " + characterChoice + ". Are you sure?");
            message("Yes or No");
            String changeType = exitGame(input);

            if (changeType.equals("No")) {
                message("Change the type of your character (type Warrior or Witcher):");
                characterChoice = exitGame(input);

            }

            message("Enter a name for your character: ");
            String name = exitGame(input);


            message("Name: " + name);

            message("Do you want to change your character?");
            message("Yes or No");
            String changeName = exitGame(input);

            if (changeName.equals("Yes")) {
                message("Change the name of your character");
                name = exitGame(input);
            }

            return new Character(name);
        }
    }


    /**
     * Exit the game when selected
     */
    protected static String exitGame(Scanner input) {
        String text = input.nextLine();
        if (text.equals("exit")) {
            message("Exit the game");
            System.exit(0);
        }
        ;
        return text;
    }

    /**
     * Start the game
     */
    protected static void startGame() {
        message("Start the game");
    }
}
