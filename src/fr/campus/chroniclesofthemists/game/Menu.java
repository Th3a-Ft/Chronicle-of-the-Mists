package fr.campus.chroniclesofthemists.game;

import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.character.Warrior;
import fr.campus.chroniclesofthemists.character.Witcher;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.util.Scanner;


public class Menu {
    Scanner input = new Scanner(System.in);

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
    protected Character createCharacter() throws IllegalAnswerException {

        //Scanner input = new Scanner(System.in);
        String characterChoice;

        /**
         *While input is different of "exit" the game continue
         */
        while (true) {
            message("You can close the game at any time by typing \"exit\"");
            message("Choose your character: Witcher or Warrior (type you choice)");

            characterChoice = exitGame(input);

            //characterChoice = validateCharacterType(characterChoice);
            characterChoice = validateAnswer(characterChoice);

            message("You choose to be a " + characterChoice + ". Are you sure? (Yes / No)");

            String changeType = exitGame(input);
            changeType = validateAnswer(changeType);

            if (changeType.equalsIgnoreCase("No")) {
                message("Change the type of your character (type Warrior or Witcher):");
                //characterChoice = validateCharacterType(characterChoice);
                characterChoice = validateAnswer(characterChoice);
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
                Character character = new Witcher(name);
                message(character.toString());
                message("Welcome young " + character.getName() + "!");
                return character;
                //message("You have a long road ahead of you, you'll have to go through " + board.size() + " cells. Be careful, enemies are waiting for you!");

            } else {
                Character character = new Warrior(name);
                message(character.toString());
                message("Welcome young " + character.getName() + "!");
                return character ;
            }
        }
    }

    public Character getNewCharacter() throws IllegalAnswerException {
        return createCharacter();
    }


    protected String validateAnswer(String answer) throws IllegalAnswerException {
        Scanner input = new Scanner(System.in);
        while (!answer.equalsIgnoreCase("Warrior") && !answer.equalsIgnoreCase("Witcher"))
            try {
                throw new IllegalAnswerException();
            } catch (IllegalAnswerException error) {
                error.IllegalAnswerMessage();
                answer = exitGame(input);
            }
        return answer;
    }

    /**
     * Exit the game when "exit" is type in the fields
     *
     * @param input = text that the player typed
     */
    public static String exitGame(Scanner input) {
        String text = input.nextLine();
        if (text.equalsIgnoreCase("exit")) {
            message("Exit the game");
            System.exit(0);
        };
        return text;
    }

    public static void restartGame() {
        Scanner input = new Scanner(System.in);
        message("Do you want to restart (type \"restart\") or close (type \"exit\") the game?");

        String restartGame = exitGame(input);
        if (restartGame.equalsIgnoreCase("Restart")) {
            message("Restarting the game");
            Game game = new Game();
            game.playTurn();
        } else {
            System.exit(0);
        }
    }

    public void getEquipment() {
        message("Do you want to take this equipment? (type Yes or No)");
        String takeEquipment = exitGame(input);
        if (takeEquipment.equalsIgnoreCase("Yes")) {
            message("New equipment taken");
        } else {
            message("You chose to not take this equipment. Are you sure? (Yes / No)");

        }
    }


}
