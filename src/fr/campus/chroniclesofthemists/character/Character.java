package fr.campus.chroniclesofthemists.character;
import fr.campus.chroniclesofthemists.equipment.DefensiveEquipment;
import fr.campus.chroniclesofthemists.equipment.OffensiveEquipment;

abstract public class Character {
    protected String name;
    protected int hp;
    protected int attack;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;

    public Character(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    abstract public int setHP();
    abstract public int setAttack();

    @Override
    public String toString() {
        return "Character:" + getName() + " HP:" + setHP() + " Attack: "+ setAttack();
    }

    private void battle(){

    }

    private void applyEffect(){
    }
}
