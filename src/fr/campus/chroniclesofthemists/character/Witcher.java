package fr.campus.chroniclesofthemists.character;

public class Witcher extends Character{
    public Witcher(String name) {
        super(name);
    }
    public int setHP() {
        this.hp = 6;
        return hp;
    }

    public int setAttack(){
        this.attack=8;
        return attack;
    }
}
