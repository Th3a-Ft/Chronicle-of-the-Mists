package fr.campus.chroniclesofthemists.game;

import static fr.campus.chroniclesofthemists.game.Menu.message;
import static fr.campus.chroniclesofthemists.game.Menu.restartGame;

import fr.campus.chroniclesofthemists.cell.*;
import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.db.DBConnexion;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Create a new game with the possibility to create a character and roll the dice
 */
public class Game {
    private Menu menu;
    private Character character;
    private int playerPosition = 1;
    private ArrayList<Cell> board;
    private String gameState;

    /**
     * Create a new object Menu and call the createBoard() from the Menu class
     */
    public Game() throws IllegalAnswerException {
        this.menu = new Menu();
        this.createBoard();

    }

    /**
     * Allow the player to move across the board
     * Create a new dice with a new value while the player position is under the size of the board
     */
    public void playTurn() throws IllegalAnswerException {

        character = menu.getNewCharacter();

        try {
            while (playerPosition != board.size()) {
                if (playerPosition > board.size()) {
                    gameState = "done";
                    throw new CharacterOutOfBoundException(playerPosition);
                } else {
                    for (int i = 0; i < board.size(); i++) {
                        gameState = "in progress";
                        Dice dice = new Dice();
                        playerPosition += dice.getRollDice();
                        message("You are in the cell n°" + i);
                        message("Move " + dice.getRollDice());
                        Cell cell = board.get(i);
                        message(cell.toString());
                    }
                }
            }
        } catch (CharacterOutOfBoundException error) {
            error.getMessage();
            restartGame();
        }
    }

    /**
     * Create the board thanks to an ArrayList of Cell objects
     */
    public ArrayList<Cell> createBoard() {
        board = new ArrayList<>();
        while (board.size() < 10) {

            EmptyCell emptyCell = new EmptyCell();
            EnemyCell enemyCell = new EnemyCell();
            WeaponCell weaponCell = new WeaponCell();
            PotionCell potionCell = new PotionCell();

            board.add(emptyCell);
            board.add(enemyCell);
            board.add(weaponCell);
            board.add(potionCell);
        }
        message(board.size() + " cells created");
        return board;
    }


}
