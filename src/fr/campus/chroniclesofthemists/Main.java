package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBHeroes;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;
import fr.campus.chroniclesofthemists.game.Game;
import fr.campus.chroniclesofthemists.game.Menu;


public class Main {
    public static void main(String[] args) throws IllegalAnswerException, CharacterOutOfBoundException {
        DBHeroes connexion = new DBHeroes();
        Menu menu = new Menu();
//        connexion.createHeroes(menu.getNewCharacter());
        connexion.getHeroes();
        connexion.editHeroes();

        //menu.updateCharacter();

//        Game game = new Game();
//        game.playTurn();


    }
}
