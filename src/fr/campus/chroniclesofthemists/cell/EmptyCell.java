package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class EmptyCell extends Cell {
    @Override
    protected void effect() {
        message("Empty cell: keep going!");
    }
}
