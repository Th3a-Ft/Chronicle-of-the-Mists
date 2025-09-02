package fr.campus.chroniclesofthemists.cell;

public class EnemyCell extends Cell {

    public EnemyCell(){
        super();
    }

    @Override
    protected String effect() {
        return "Oh no! An enemy ! You have to beat him!";
    }

    @Override
    protected void applyEffect() {
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
