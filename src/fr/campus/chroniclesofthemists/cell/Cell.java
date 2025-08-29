package fr.campus.chroniclesofthemists.cell;

abstract public class Cell {
    protected int cellNumber;

    abstract protected void effect();

    @Override
    public String toString(){
        return  "You are in the cell n°" + cellNumber;
    }

}
