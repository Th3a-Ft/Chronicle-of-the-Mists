public class Game {
    private Dice dice;
    private Menu menu;

    public Game(){
        this.dice = new Dice();
        this.menu = new Menu();
    }

    public void playGame(){
        menu.createCharacter();
        menu.startGame();
        dice.getRollDice();
    }
}
