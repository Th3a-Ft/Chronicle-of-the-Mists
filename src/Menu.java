import java.util.Scanner;

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
     * The player can close the game at any time by typing "exit"
     * return object Character
     */
    public Character createCharacter() {
        Scanner input = new Scanner(System.in);
        /**
         *While input is different of "exit" the game continue
         */
        while (true) {
            message("You can close the game at any time by tipping \"exit\"");
            message("Choose your character: (type you choice)");
            message("Witcher or Warrior");

            String characterChoice = exitGame(input);

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

            message("Do you want to start the game?");
            message("Yes or No (close game)");
            String startGame = exitGame(input);
            if (startGame.equals("Yes")) {
                message("Start the game");
            } else {
                System.exit(0);
            }

            return new Character(name);
        }
    }

    /**
     * Exit the game when "exit" is type in the fields
     *
     * @param input = text that the player typed
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
    public Dice startGame() {
        Scanner input = new Scanner(System.in);
        message("Start the game");
        int characterPosition = 1;

        while (characterPosition != 64) {
            Dice dice = new Dice();
            characterPosition += dice.getRollDice();
            if (characterPosition < 64) {
                message("Move " + dice.getRollDice());
                message("You are on the square " + characterPosition);

            } else if (characterPosition > 64) {
                characterPosition = 64 - (characterPosition - 64);
                message("Move " + dice.getRollDice());
                message("You are on the square " + characterPosition);

            }
        }
        message("Winner");

        message("Do you want to restart (type \"restart\") or close (type \"exit\") the game?");
        String restartGame = exitGame(input);
        if (restartGame.equals("Restart")) {
            message("Restarting the game");
            this.createCharacter();
        } else {
            System.exit(0);
        }

        return new Dice();
    }
}
