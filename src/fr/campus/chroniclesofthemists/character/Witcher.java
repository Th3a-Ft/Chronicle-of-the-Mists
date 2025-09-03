package fr.campus.chroniclesofthemists.character;

public class Witcher extends Character {
    public Witcher(String name) {
        super(name);
    }

//    @Override
//    public String setName() {
//        return super.setName();
//    }

//    public String setOffensiveEquipment() {
//        return "offensive Witcher";
//    };
//
//    public String setDefensiveEquipment() {
//        return "defensive Witcher";
//    };
//
//    public String setType(String type) {
//        type = "Witcher";
//        return type;
//    }

    public int getHP() {
        this.hp = 6;
        return hp;
    }

    public int getAttack() {
        this.attack = 8;
        return attack;
    }
}
