package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class PotionCell extends Cell {
    @Override
    protected void effect() {
        message("You found a potion!");
    }
}
