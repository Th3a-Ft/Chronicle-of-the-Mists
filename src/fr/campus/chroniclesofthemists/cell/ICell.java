package fr.campus.chroniclesofthemists.cell;

import fr.campus.chroniclesofthemists.character.Character;
interface ICell {
    public void interact(Character character);
    //public String effect();
    public String getEffect();
    public String toString();


}
