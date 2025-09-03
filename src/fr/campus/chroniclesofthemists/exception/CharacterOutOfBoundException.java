package fr.campus.chroniclesofthemists.exception;

import static fr.campus.chroniclesofthemists.game.Menu.message;
import static fr.campus.chroniclesofthemists.game.Menu.restartGame;

/**
 * Error if the player is out of the board (more than 64)
 */
public class CharacterOutOfBoundException extends Exception {
    public void GameOver() throws IllegalAnswerException {
        message("Congrats, you're at the end of the road!");
        restartGame();
    }
}
//enlever throws