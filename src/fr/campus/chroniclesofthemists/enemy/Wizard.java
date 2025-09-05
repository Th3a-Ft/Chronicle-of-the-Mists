package fr.campus.chroniclesofthemists.enemy;

import fr.campus.chroniclesofthemists.character.Character;

public class Wizard extends Character {
    public Wizard() {
        super("Wizard");
    }

    @Override
    public String setType() {
        type = "Wizard";
        return type;
    }

    @Override
    public String toString(){
        return "A " + this.setType();
    }
}
