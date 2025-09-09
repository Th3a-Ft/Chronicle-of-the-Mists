package fr.campus.chroniclesofthemists.cell;

import fr.campus.chroniclesofthemists.character.Character;

public class EmptyCell extends Cell implements ICell{

    public EmptyCell() {
        super("empty");
    }


    @Override
    protected String effect() {
        return "Empty cell: keep going!";
    }

    @Override
    public void interact(Character character) {
        super.interact(character);
    }
}
