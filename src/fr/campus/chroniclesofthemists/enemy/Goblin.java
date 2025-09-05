package fr.campus.chroniclesofthemists.enemy;

import fr.campus.chroniclesofthemists.character.Character;

public class Goblin extends Character {
    public Goblin() {
        super("Goblin");
    }

    @Override
    public String setType() {
        type = "Goblin";
        return type;
    }

    @Override
    public String toString(){
        return "A " + this.setType();
    }
}
