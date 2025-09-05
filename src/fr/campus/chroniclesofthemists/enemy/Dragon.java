package fr.campus.chroniclesofthemists.enemy;

import fr.campus.chroniclesofthemists.character.Character;

public class Dragon extends Character {
    public Dragon(){
        super("Dragon");
    }

    @Override
    public String setType() {
        type = "Dragon";
        return type;
    }

    @Override
    public String toString(){
        return "A " + this.setType();
    }
}
