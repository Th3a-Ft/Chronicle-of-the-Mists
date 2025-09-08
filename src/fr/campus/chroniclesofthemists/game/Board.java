package fr.campus.chroniclesofthemists.game;

import fr.campus.chroniclesofthemists.cell.*;

import java.util.ArrayList;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class Board {
    private ArrayList<Cell> board;

    public ArrayList<Cell> initBoard() {
        board = new ArrayList<>();
        while (board.size() < 10) {

            EmptyCell emptyCell = new EmptyCell();
            EnemyCell enemyCell = new EnemyCell();
            WeaponCell weaponCell = new WeaponCell();
            PotionCell potionCell = new PotionCell();

            board.add(emptyCell);
            board.add(enemyCell);
            board.add(weaponCell);
            board.add(potionCell);
        }
        message(board.size() + " cells created");
        return board;
    }
}
