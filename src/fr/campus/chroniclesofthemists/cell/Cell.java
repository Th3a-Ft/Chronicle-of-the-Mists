package fr.campus.chroniclesofthemists.cell;

import fr.campus.chroniclesofthemists.character.Warrior;
import fr.campus.chroniclesofthemists.character.Witcher;
import fr.campus.chroniclesofthemists.character.Character;

import static fr.campus.chroniclesofthemists.game.Menu.message;

/**
 * Class cell from whom all the cells are going to herit
 */

abstract public class Cell implements ICell {
    private String type;

    /**
     * Constructor of the class Cell
     *
     */
    public Cell(String type) {
        this.type = type;
    }

    /**
     * Display the effect of the cell to the player
     *
     * @return (string) the effect of the cell
     */
    abstract protected String effect();


    /**
     * get the effect of the cell
     *
     * @return (string)
     */
    @Override
    public String getEffect() {
        return effect();
    }

    /**
     * Function to return in which the player is
     *
     * @return (string) with the number of the cell and the effect
     */
    @Override
    public String toString() {
        return effect();
    }

    @Override
    public void interact(Character character) {
        if (character instanceof Witcher) {
            message("This equipment is for a wizard.");
        } else if (character instanceof Warrior) {
            message("This equipment is for a warrior.");
        }
    }

}
