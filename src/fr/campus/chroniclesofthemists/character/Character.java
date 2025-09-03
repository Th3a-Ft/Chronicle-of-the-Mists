package fr.campus.chroniclesofthemists.character;
import fr.campus.chroniclesofthemists.equipment.DefensiveEquipment;
import fr.campus.chroniclesofthemists.equipment.OffensiveEquipment;

/**
 * define our character
 * class Character from whom all the type of character are going to herit
 */
abstract public class Character {
    private String name;
    protected String type;
    protected int hp;
    protected int attack;
    protected String offensiveEquipment;
    protected String defensiveEquipment;

    /**
     * Constructor of class Character
     * @param name
     */
    public Character(String name) {
        this.name=name;
    }

//    public String setName() {
//        return name;
//    }

    public String setType() {
        return type;
    }
    public String getName() {
        return name;
    }

    //abstract public String setType(String type);
    public String getType(){
        return type;
    };

   // abstract  public String setOffensiveEquipment();
    public String getOffensiveEquipment(){
        return offensiveEquipment;
    };

    //abstract  public String setDefensiveEquipment();
    public String getDefensiveEquipment(){
        return defensiveEquipment;
    };


    /**
     * set the HP for each type of Character in the daughters
     * @return (int) health point for a type of character
     */
    //abstract public int setHP();
    public int getHP(){
        return hp;
    };

    /**
     * set the Attack point for each type of Character in the classes
     * @return (int) health point for a type of character
     */
    //abstract public int setAttack();
    public int getAttack(){
        return attack;
    };

    /**
     *
     * @return (strings) all the characteristics of the character according his type (warrior or witcher)
     */
    @Override
    public String toString() {
        return "Character:" + getName() + " HP:" + getHP() + " Attack: "+ getAttack();
    }


}
