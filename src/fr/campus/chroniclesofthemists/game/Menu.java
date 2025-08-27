package fr.campus.chroniclesofthemists.game;
import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.character.Warrior;
import fr.campus.chroniclesofthemists.character.Witcher;

import java.util.Scanner;
//package fr.campus.chroniclesofthemists.game;

public class Menu {
    private Character character;

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
        String characterChoice;

        /**
         *While input is different of "exit" the game continue
         */
        while (true) {
            message("You can close the game at any time by typing \"exit\"");
            message("Choose your character: Witcher or Warrior (type you choice)");

            characterChoice = exitGame(input);

            /*if(!characterChoice.equalsIgnoreCase("Witcher") && !characterChoice.equalsIgnoreCase("Warrior")) {
                message("Error! Please choose a valid character (Warrior or Witcher)");
                characterChoice = exitGame(input);
            }*/

            characterChoice = validateCharacterType(characterChoice);

            message("You choose to be a " + characterChoice + ". Are you sure? (Yes / No)");

            String changeType = exitGame(input);

            if (changeType.equalsIgnoreCase("No")) {
                message("Change the type of your character (type Warrior or Witcher):");
                characterChoice = validateCharacterType(characterChoice);
            }

            message("Enter a name for your character: ");
            String name = exitGame(input);

            message("Name: " + name);

            message("Do you want to change your name's character? (Yes / No)");

            String changeName = exitGame(input);

            if (changeName.equalsIgnoreCase("Yes")) {
                message("Change the name of your character");
                name = exitGame(input);
            }

            message("Do you want to start the game? (Yes / No, exit)");

            String startGame = exitGame(input);
            if (startGame.equalsIgnoreCase("Yes")) {
                message("Start the game");
            } else {
                System.exit(0);
            }

            if (characterChoice.equalsIgnoreCase("Witcher")) {
                return this.character = new Witcher(name);
            } else {
                return this.character = new Warrior(name);
            }

        }
    }

    /**
     * Validate the type of character enter by the player
     *
     * @param characterChoice = first input of the player
     * @return the characterChoice modified and correct
     */
    public String validateCharacterType(String characterChoice) {
        Scanner input = new Scanner(System.in);
        while (!characterChoice.equalsIgnoreCase("Warrior") && !characterChoice.equalsIgnoreCase("Witcher"))
            try {
                throw new IllegalArgumentException("Error! Please choose a type a valid answer");
            } catch (IllegalArgumentException e) {
                message("Error! Please choose a valid character (Warrior or Witcher)");
                characterChoice = exitGame(input);
            }
        return characterChoice;
    }

    /**
     * Exit the game when "exit" is type in the fields
     *
     * @param input = text that the player typed
     */
    protected static String exitGame(Scanner input) {
        String text = input.nextLine();
        if (text.equalsIgnoreCase("exit")) {
            message("Exit the game");
            System.exit(0);
        }
        ;
        return text;
    }

    /**
     * Start the game
     * While the player is not on the square n°64, the game continue
     * if the player lands on a square higher than 64, he moves backwards
     */
    public Dice startGame() {
        Scanner input = new Scanner(System.in);


        message("Welcome young " + character.getName() + "!");
        message(character.toString());
        //message("You have " + character.setHP() + " HP & " + character.setAttack()+" attack points!");
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
        if (restartGame.equalsIgnoreCase("Restart")) {
            message("Restarting the game");
            this.createCharacter();
        } else {
            System.exit(0);
        }

        return new Dice();
    }
}
