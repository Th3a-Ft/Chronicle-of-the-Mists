package fr.campus.chroniclesofthemists.exception;

import static fr.campus.chroniclesofthemists.game.Menu.message;
import static fr.campus.chroniclesofthemists.game.Menu.restartGame;


public class CharacterOutOfBoundException extends Exception {
    public void GameOver() {
        message("Congrats, you're at the end of the road!");
        restartGame();
    }
}
