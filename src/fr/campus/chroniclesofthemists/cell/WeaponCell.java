package fr.campus.chroniclesofthemists.cell;


import fr.campus.chroniclesofthemists.equipment.Club;
import fr.campus.chroniclesofthemists.equipment.Sword;

public class WeaponCell extends Cell {

    public WeaponCell(){
        super("weapon");
    }
    protected String TypeOfWeapon() {
        String weaponType;
        int type = (int) (Math.random() * 2) + 1;
        if (type == 1) {
            Club club = new Club();
            weaponType = club.toString();
            return weaponType;
        } else if (type == 2) {
            Sword sword = new Sword();
            weaponType = sword.toString();
            return weaponType;
        }
        return null;
    }

    @Override
    protected String effect() {
        return "You found a " +this.TypeOfWeapon()+"!";
    }

    @Override
    protected void applyEffect() {
    }
}
