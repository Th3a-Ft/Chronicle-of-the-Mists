package fr.campus.chroniclesofthemists.game;

import static fr.campus.chroniclesofthemists.game.Menu.message;
import static fr.campus.chroniclesofthemists.game.Menu.restartGame;

import fr.campus.chroniclesofthemists.cell.*;
import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.db.DBConnexion;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;


/**
 * Create a new game with the possibility to create a character and roll the dice
 */
public class Game {
    private Menu menu;
    private Character character;
    private int playerPosition = 1;
//    private ArrayList<Cell> board;
    private String gameState;

    /**
     * Create a new object Menu and call the createBoard() from the Menu class
     */
    public Game() {
        this.menu = new Menu();
//        this.createBoard();
        menu.startGame();
//        character= menu.getNewCharacter();

    }

    /**
     * Allow the player to move across the board
     * Create a new dice with a new value while the player position is under the size of the board
     */
    public void playTurn()  {

       // character = menu.getNewCharacter();

        Board board = new Board();
        ArrayList<Cell> newBoard=board.initBoard(64,16,8,24);

        try {
            while (playerPosition != newBoard.size()) {
                if (playerPosition > newBoard.size()) {
                    gameState = "done";
                    throw new CharacterOutOfBoundException(playerPosition);
                } else {
                    for (int i = 0; i < newBoard.size()-1; i++) {
                        gameState = "in progress";
                        Dice dice = new Dice();
                        playerPosition += dice.getRollDice();
                        message("You are in the cell n°" + i);
                        message("Move " + dice.getRollDice());
                        Cell cell = newBoard.get(i);
                        message(cell.toString());
                    }
                }
            }
        } catch (CharacterOutOfBoundException error) {
            restartGame();
        }
    }



}
