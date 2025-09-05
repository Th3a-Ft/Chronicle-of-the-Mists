package fr.campus.chroniclesofthemists.equipment;

abstract public class OffensiveEquipment {
    String type;
    String name;
    int strength;

    protected OffensiveEquipment(){};

    protected String setType(){
        return type;
    }

    protected String setStrength(){
        return type;
    }

    @Override
    public String toString() {
        return "This " + type + " is a " + name + " with " + strength + " attack points";
    }
}
