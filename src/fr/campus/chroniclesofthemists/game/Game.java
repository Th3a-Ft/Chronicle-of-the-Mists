package fr.campus.chroniclesofthemists.game;
import fr.campus.chroniclesofthemists.Main;

/**
 * Create a new game with the possibility to create a character and roll the dice
 */
public class Game {
     private Menu menu;

    public Game(){
        this.menu = new Menu();
    }

    public void playGame(){
        menu.createCharacter();
        menu.startGame();
    }
}
