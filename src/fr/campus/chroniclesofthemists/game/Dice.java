package fr.campus.chroniclesofthemists.game;

public class Dice {
    private int rollDice=(int)(Math.random()*6)+1;

    public int getRollDice(){
        return rollDice;
    }
}
