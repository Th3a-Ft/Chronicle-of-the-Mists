package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBHeroes;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;
import fr.campus.chroniclesofthemists.game.Game;
import fr.campus.chroniclesofthemists.game.Menu;


public class Main {
    public static void main(String[] args) throws IllegalAnswerException {
//        Game game = new Game();
//        game.playTurn();

        DBHeroes connexion = new DBHeroes();
        connexion.getHeroes();
        Menu menu = new Menu();
        connexion.createHeroes(menu.getNewCharacter());
    }
}
