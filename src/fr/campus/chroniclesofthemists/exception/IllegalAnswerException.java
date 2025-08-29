package fr.campus.chroniclesofthemists.exception;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class IllegalAnswerException extends Exception {

    public void IllegalAnswerMessage() {
        message("Error! Please type a valid answer");
    }
}
