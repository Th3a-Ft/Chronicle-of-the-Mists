package fr.campus.chroniclesofthemists.exception;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class CharacterOutOfBoundException extends Exception {
    public static void GameOver() {
        message("Congrats, you're at the end of the road!");
    }
}
