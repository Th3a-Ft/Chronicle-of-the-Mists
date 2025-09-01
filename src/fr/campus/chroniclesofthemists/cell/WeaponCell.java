package fr.campus.chroniclesofthemists.cell;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class WeaponCell extends Cell {

    public WeaponCell(){
        super();
    }

    @Override
    protected String effect() {
        return "You found a weapon.";
    }

    @Override
    protected void applyEffect() {
    }
}
