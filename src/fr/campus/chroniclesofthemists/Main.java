package fr.campus.chroniclesofthemists;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.game.Game;

public class Main {
    public static void main(String[] args) {
            Game game = new Game();
            game.playTurn();
    }
}
