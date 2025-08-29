package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class WeaponCell extends Cell {
    @Override
    protected void effect() {
        message("You've found a Weapon");
    }
}
