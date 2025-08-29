package fr.campus.chroniclesofthemists.game;

import static fr.campus.chroniclesofthemists.game.Menu.message;

import fr.campus.chroniclesofthemists.cell.*;
import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.exception.CharacterOutOfBoundException;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.util.ArrayList;


/**
 * Create a new game with the possibility to create a character and roll the dice
 */
public class Game {
    private Menu menu;
    private Character character;
    private int playerPosition = 1;
    private ArrayList<Cell> board;

    public Game() {
        this.menu = new Menu();
        this.createBoard();
    }

    public void playTurn() {
        try {
            character = menu.getNewCharacter();
        } catch (IllegalAnswerException error) {
            error.IllegalAnswerMessage();
        }

        try {
            //startGame();
            while (playerPosition != board.size() + 1) {
                if (playerPosition >= board.size()) {
                    throw new CharacterOutOfBoundException();
                } else {
                    Dice dice = new Dice();
                    playerPosition += dice.getRollDice();
                    message("Move " + dice.getRollDice());
                    message("You are on the cell " + playerPosition);
                }
            }
        } catch (CharacterOutOfBoundException error) {
            error.GameOver();
        }
    }

    /**
     * Start the game
     * While the player is not on the square n°64, the game continue
     * if the player lands on a square higher than 64, an error is thrown
     */

//    private void startGame() {
//
//        message("Welcome young " + character.getName() + "!");
//        message("You have a long road ahead of you, you'll have to go through " + board.size() + " cells. Be careful, enemies are waiting for you!");
//        message(character.toString());

//        while (playerPosition != board.size() + 1) {
//            if (playerPosition >= board.size()) {
//                throw new CharacterOutOfBoundException();
//            } else {
//                Dice dice = new Dice();
//                playerPosition += dice.getRollDice();
//                message("Move " + dice.getRollDice());
//                message("You are on the cell " + playerPosition);
//            }
//        }
    //}

    private ArrayList<Cell> createBoard() {
        EmptyCell emptyCell = new EmptyCell();
        EnemyCell enemyCell = new EnemyCell();
        WeaponCell weaponCell = new WeaponCell();
        PotionCell potionCell = new PotionCell();
        board = new ArrayList<Cell>();
        board.add(emptyCell);
        board.add(enemyCell);
        board.add(weaponCell);
        board.add(potionCell);

        return board;
    }

    //Player attaque en premier si HP ennemi > attackPlayer alors
    //ennemi attaque puis fuis
    //si attackeEnemy < HPPlayer alors HPPlayer = HP - attackEnnemy
    //sinon Game Over
//    private void fight() {
//        message("A enemy is on this case, you have to defeat him!");
//        //enemy.setHP()=character.setAttack()-enemy.setHP()
//        if (character.setHP() <= 0){
//            message("You are dead, see you next time young " + character.getName());
//            System.exit(0);
//        }
//    }


}
