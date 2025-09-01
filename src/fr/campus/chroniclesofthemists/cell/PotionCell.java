package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class PotionCell extends Cell {

    public PotionCell(){
        super();
    }

    @Override
    protected String effect() {
        return "You found a potion!";
    }

    @Override
    protected void applyEffect() {
    }
}
