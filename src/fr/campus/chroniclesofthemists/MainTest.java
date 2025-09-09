package fr.campus.chroniclesofthemists;

import fr.campus.chroniclesofthemists.db.DBBoard;
import fr.campus.chroniclesofthemists.db.DBHeroes;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;

import fr.campus.chroniclesofthemists.game.Board;
import fr.campus.chroniclesofthemists.game.Game;
import fr.campus.chroniclesofthemists.game.Menu;

public class MainTest {

    //ne pas throws Exceptions dans le Main
    public static void main(String[] args) {
 //      Menu menu = new Menu();
//        menu.startGame();
 //            Game game = new Game();
               Board board = new Board();
//               board.deleteCell();

//      DBHeroes connexion = new DBHeroes();
             DBBoard boardDB = new DBBoard();
             boardDB.boardToDB(board);

 //     connexion.createHeroes(menu.getNewCharacter());
//      connexion.getHeroes();
//      connexion.editHeroes();

//      menu.updateCharacter();

        //      game.playTurn();
        //       board.initBoard();
    }
}