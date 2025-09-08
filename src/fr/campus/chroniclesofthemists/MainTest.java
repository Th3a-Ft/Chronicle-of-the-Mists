package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBBoard;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;

import fr.campus.chroniclesofthemists.game.Board;
import fr.campus.chroniclesofthemists.game.Game;

public class MainTest {

    //ne pas throws Exceptions dans le Main
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();

//      DBHeroes connexion = new DBHeroes();
//      DBBoard board = new DBBoard();
//      board.boardToDB(game);
//      Menu menu = new Menu();
//      connexion.createHeroes(menu.getNewCharacter());
//      connexion.getHeroes();
//      connexion.editHeroes();

//      menu.updateCharacter();

        game.playTurn();
        board.initBoard();
    }
}