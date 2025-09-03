package fr.campus.chroniclesofthemists.character;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name);
    }

//    public String setOffensiveEquipment(){
//        return "offensive Warrior";
//    };
//
//    public String setDefensiveEquipment(){
//        return "defensive Warrior";
//    };
//
//    public String setType(String type) {
//        type = "Warrior";
//        return type;
//    }

    public int setHP() {
        this.hp = 10;
        return hp;
    }

    public int setAttack(){
        this.attack=8;
        return attack;
    }
}
