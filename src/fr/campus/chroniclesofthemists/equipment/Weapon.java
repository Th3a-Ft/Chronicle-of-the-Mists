package fr.campus.chroniclesofthemists.equipment;

abstract class Weapon extends OffensiveEquipment{

    abstract String setName();
    @Override
    protected String setType() {
        type="Weapon";
        return super.setType();
    }

    @Override
    public String toString(){
        return this.setName();
    }

}
