package fr.campus.chroniclesofthemists.character;

public class Witcher extends Character {
    public Witcher(String name) {
        super(name);
    }


    public String getOffensiveEquipment() {
        return "offensive Witcher";
    };

    public String getDefensiveEquipment() {
        return "defensive Witcher";
    };

    public String setType() {
        type = "Witcher";
        return type;
    }

    public int getHP() {
        this.hp = 6;
        return hp;
    }

    public int getAttack() {
        this.attack = 8;
        return attack;
    }
}
