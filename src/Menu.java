import java.util.Scanner;

/**
 * Display various messages & display the menu at the beginning of the game
 */
public class Menu {
    /**
     * Display all the messages
     * @param message : message to display
     */
    protected static void message(String message) {
        System.out.println(message);
    }

    /**
     * Choose the character and display all the information about it
     * The player can name his character and update the info about his character
     */
    protected static void createCharacter() {
        Scanner input = new Scanner(System.in);
        message("Choose your character: ");
        message("Witcher");
        message("Warrior");

        String characterChoice=input.nextLine();

        if (characterChoice.equals("Witcher")) {
           message("You choose to become a Witcher");
        } else {
            message("You choose to become a Warrior");
        }
        message("Enter a name for your character: ");
        Character.setName()=input.nextLine();
        message("HP: " + Character.hp);
    }

    /**
     * Exit the game when selected
     */
    protected static void closeGame(){
        message("Exit the game");
        System.exit(0);
    }

    /**
     * Start the game
     */
    protected static void startGame(){
        message("Start the game");
    }
}
