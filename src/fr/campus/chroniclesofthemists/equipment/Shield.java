package fr.campus.chroniclesofthemists.equipment;

public class Shield extends DefensiveEquipment{

    @Override
    protected String setType() {
        type = "Shield";
        return super.setStrength();
    }
}
