package fr.campus.chroniclesofthemists.character;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name);
    }

    public String getOffensiveEquipment(){
        return "offensive Warrior";
    };

    public String getDefensiveEquipment(){
        return "defensive Warrior";
    };


    public String setType() {
        type = "Warrior";
        return type;
    }

    public int getHP() {
        this.hp = 10;
        return hp;
    }

    public int getAttack(){
        this.attack=8;
        return attack;
    }
}
