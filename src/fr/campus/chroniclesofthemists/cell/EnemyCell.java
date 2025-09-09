package fr.campus.chroniclesofthemists.cell;

import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.enemy.Dragon;
import fr.campus.chroniclesofthemists.enemy.Goblin;
import fr.campus.chroniclesofthemists.enemy.Wizard;

public class EnemyCell extends Cell implements ICell  {

    public EnemyCell() {
        super("enemy");
    }

    protected String TypeOfEnemy() {
        String enemyType;
        int type = (int) (Math.random() * 3) + 1;
        if (type == 1) {
            Dragon dragon = new Dragon();
            enemyType = dragon.toString();
            return enemyType;
        } else if (type == 2) {
            Goblin goblin = new Goblin();
            enemyType = goblin.toString();
            return enemyType;
        } else if (type == 3) {
            Wizard wizard = new Wizard();
            enemyType = wizard.toString();
            return enemyType;
        }
        return null;
    }


    @Override
    protected String effect() {
        return "Oh no! " + this.TypeOfEnemy() + "! You have to beat him!";
    }

    @Override
    public void interact(Character character) {
        super.interact(character);
    }

    //Player attaque en premier si HP ennemi > attackPlayer alors
//ennemi attaque puis fuis
//si attackeEnemy < HPPlayer alors HPPlayer = HP - attackEnnemy
//sinon Game Over
//    private void fight() {
//        message("A enemy is on this case, you have to defeat him!");
//        //enemy.setHP()=character.setAttack()-enemy.setHP()
//        if (character.setHP() <= 0){
//            message("You are dead, see you next time young " + character.getName());
//            System.exit(0);
//        }
//    }
}
