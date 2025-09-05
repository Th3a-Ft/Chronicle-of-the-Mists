package fr.campus.chroniclesofthemists.equipment;

abstract class Potion extends DefensiveEquipment{

    abstract String setName();

    @Override
    protected String setType() {
        type = "Potion";
        return super.setType();
    }

    public String toString(){
        return setName();
    }
}
