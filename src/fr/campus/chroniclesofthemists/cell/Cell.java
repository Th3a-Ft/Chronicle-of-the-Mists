package fr.campus.chroniclesofthemists.cell;

/**
 * Class cell from whom all the cells are going to herit
 */

abstract public class Cell {
    protected int cellNumber;

    /**
     * Constructor of the class Cell
     *
     */
    public Cell(){

    }

    /**
     * Display the effect of the cell to the player
     * @return (string) the effect of the cell
     */
    abstract protected String effect();

    /**
     * Apply the effect of the cell (weapon, potion, enemy) to the game
     */
    abstract protected void applyEffect();

    /**
     * get the effect of the cell
     * @return (string)
     */
    protected String getEffect(){
        return effect();
    }

    /**
     * Function to return in which the player is
     * @return (string) with the number of the cell and the effect
     */
    @Override
    public String toString(){

        return getEffect();
    }

}
