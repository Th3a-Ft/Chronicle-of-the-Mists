package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBHeroes;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;
import fr.campus.chroniclesofthemists.game.Game;
import fr.campus.chroniclesofthemists.game.Menu;


public class Main {
    public static void main(String[] args) throws IllegalAnswerException, CharacterOutOfBoundException {
        DBHeroes connexion = new DBHeroes();
        connexion.getHeroes();
        connexion.editHeroes();

        Menu menu = new Menu();
        //menu.updateCharacter();
//        connexion.createHeroes(menu.getNewCharacter());

//        Game game = new Game();
//        game.playTurn();


    }
}
