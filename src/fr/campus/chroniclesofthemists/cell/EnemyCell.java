package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class EnemyCell extends Cell {
    @Override
    protected void effect() {
        message("Oh no! An enemy ! You'll have to beat him");
    }
}
