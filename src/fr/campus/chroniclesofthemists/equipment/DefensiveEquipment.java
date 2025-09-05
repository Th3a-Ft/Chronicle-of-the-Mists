package fr.campus.chroniclesofthemists.equipment;

abstract public class DefensiveEquipment {
    String type;
    String name;
    int strength;

    protected DefensiveEquipment(){};

    protected String setType(){
        return type;
    }

    protected String setStrength(){
        return type;
    }

    @Override
    public String toString() {
        return "This " + type + " is a " + name + " with " + strength + " protection points";
    }
}
