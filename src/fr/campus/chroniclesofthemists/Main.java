package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBBoard;
import fr.campus.chroniclesofthemists.db.DBHeroes;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;
import fr.campus.chroniclesofthemists.game.Game;
import fr.campus.chroniclesofthemists.game.Menu;


public class Main {
    public static void main(String[] args) throws IllegalAnswerException, CharacterOutOfBoundException {
        Game game = new Game();

//        DBHeroes connexion = new DBHeroes();
        DBBoard board = new DBBoard();
        board.BoardToDB(game);
//        Menu menu = new Menu();
//      connexion.createHeroes(menu.getNewCharacter());
//      connexion.getHeroes();
//      connexion.editHeroes();

//      menu.updateCharacter();

//      game.playTurn();
        game.createBoard();


    }
}
