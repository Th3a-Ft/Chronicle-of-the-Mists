package fr.campus.chroniclesofthemists.character;
import fr.campus.chroniclesofthemists.equipment.DefensiveEquipment;
import fr.campus.chroniclesofthemists.equipment.OffensiveEquipment;

/**
 * define our character
 * class Character from whom all the type of character are going to herit
 */
abstract public class Character {
    protected String name;
    protected int hp;
    protected int attack;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;

    /**
     * Constructor of class Character
     * @param name
     */
    public Character(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    /**
     * set the HP for each type of Character in the daughters
     * @return (int) health point for a type of character
     */
    abstract public int setHP();
    /**
     * set the Attack point for each type of Character in the classes
     * @return (int) health point for a type of character
     */
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
