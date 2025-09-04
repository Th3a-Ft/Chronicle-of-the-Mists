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
    protected Character createCharacter() throws  IllegalAnswerException {
        String characterChoice;
        Character character;

        /**
         *While input is different of "exit" the game continue
         */
        while (true) {
            message("You can close the game at any time by typing \"exit\"");
            message("Choose your character: Witcher or Warrior (type you choice)");

            characterChoice = exitGame(input);

            characterChoice = validateAnswer(characterChoice);

            message("You choose to be a " + characterChoice + ". Are you sure? (Yes / No)");

            String changeType = exitGame(input);
            changeType=validateAnswer(changeType);
            changeType = validateAnswer(changeType);

            if (changeType.equalsIgnoreCase("No")) {
                message("Change the type of your character (type Warrior or Witcher):");
                characterChoice = validateAnswer(characterChoice);
            }

            message("Enter a name for your character: ");
            String name = exitGame(input);

            message("Name: " + name);
            message("Do you want to change your name's character? (Yes / No)");

            String changeName = exitGame(input);
            changeName = validateAnswer(changeName);

            if (changeName.equalsIgnoreCase("Yes")) {
                message("Change the name of your character");
                name = exitGame(input);
            }

            message("Do you want to start the game? (Yes / No, exit)");

            String startGame = exitGame(input);
            startGame = validateAnswer(startGame);

            if (startGame.equalsIgnoreCase("Yes")) {
                message("Start the game");
            } else {
                System.exit(0);
            }

            if (characterChoice.equalsIgnoreCase("Witcher")) {
                character = new Witcher(name);
                message("type : " + character.setType());
                message(character.toString());
                message("Welcome young " + character.getName() + "!");
                return character;

            } else {
                character = new Warrior(name);
                message(character.toString());
                message("Welcome young " + character.getName() + "!");
                return character;
            }

        }
    }

    public Character getNewCharacter() throws  IllegalAnswerException {
        return createCharacter();
    }


    /**
     * When a non-validate text is type by the player an Error is thrown
     *
     * @param answer (string) : refers to the text entered by the player
     * @return (string) : the text entered by the player if correct
     */
    private String validateAnswer(String answer) throws IllegalAnswerException {
        Scanner input = new Scanner(System.in);
        while (!answer.equalsIgnoreCase("Warrior") && !answer.equalsIgnoreCase("Witcher") && !answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No"))
            try {
                throw new IllegalAnswerException(answer);
            } catch (IllegalAnswerException error) {
                //error.IllegalAnswerException();
                message(error.getMessage());
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
        }
        ;
        return text;
    }

    /**
     * At the end of the game, the player can restart or exit the game
     */
    public static void restartGame() throws IllegalAnswerException{
        Scanner input = new Scanner(System.in);
        message("Do you want to restart (type \"restart\") or close (type \"exit\") the game?");

        String restartGame = exitGame(input);
        while (!restartGame.equalsIgnoreCase("restart") && !restartGame.equalsIgnoreCase("exit")) {
            message("Error! Please type a valid answer (restart / exit).");
            restartGame = exitGame(input);
        }
        if (restartGame.equalsIgnoreCase("Restart")) {
            message("Restarting the game");
            Game game = new Game();
            game.playTurn();
        } else {
            System.exit(0);
        }
    }


//    public void getEquipment() {
//        message("Do you want to take this equipment? (type Yes or No)");
//        String takeEquipment = exitGame(input);
//        if (takeEquipment.equalsIgnoreCase("Yes")) {
//            message("New equipment taken");
//        } else {
//            message("You chose to not take this equipment. Are you sure? (Yes / No)");
//
//        }
//    }


}
