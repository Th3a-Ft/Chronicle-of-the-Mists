package fr.campus.chroniclesofthemists.cell;


import fr.campus.chroniclesofthemists.equipment.GreatPotion;
import fr.campus.chroniclesofthemists.equipment.StandardPotion;

public class PotionCell extends Cell {

    public PotionCell(){
        super("potion");
    }

    protected String TypeOfPotion() {
        String potionType;
        int type = (int) (Math.random() *2) + 1;
        if (type == 1) {
            GreatPotion potion = new GreatPotion();
            potionType = potion.toString();
            return potionType;
        } else if (type == 2) {
            StandardPotion potion = new StandardPotion();
            potionType = potion.toString();
            return potionType;
        }
        return null;
    }


    @Override
    protected String effect() {
        return "You found a " + this.TypeOfPotion()+"!";
    }

    @Override
    protected void applyEffect() {
    }
}
