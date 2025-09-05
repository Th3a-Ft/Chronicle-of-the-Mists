package fr.campus.chroniclesofthemists.equipment;

abstract class Spell extends OffensiveEquipment{

    abstract String setName();


    @Override
    protected String setType() {
        type = "Spell";
        return super.setType();
    }
}
