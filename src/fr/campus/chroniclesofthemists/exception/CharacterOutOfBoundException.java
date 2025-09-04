package fr.campus.chroniclesofthemists.exception;

import static fr.campus.chroniclesofthemists.game.Menu.message;
import static fr.campus.chroniclesofthemists.game.Menu.restartGame;

/**
 * Error if the player is out of the board (more than 64)
 */
public class CharacterOutOfBoundException extends Exception {

    public CharacterOutOfBoundException(int cellNumber) {
        super("Congrats, you're in the cell " + cellNumber + ". You've managed to survive, your travel is finished!");
    }
}