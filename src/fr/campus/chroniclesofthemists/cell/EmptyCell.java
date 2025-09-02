package fr.campus.chroniclesofthemists.cell;

public class EmptyCell extends Cell {

    public EmptyCell() {
        super();
    }

    @Override
    protected String effect() {
        return "Empty cell: keep going!";
    }

    @Override
    protected void applyEffect() {
    }
}
