package fr.campus.chroniclesofthemists.cell;

public class PotionCell extends Cell {

    public PotionCell(){
        super();
    }

    @Override
    protected String effect() {
        return "You found a potion!";
    }

    @Override
    protected void applyEffect() {
    }
}
