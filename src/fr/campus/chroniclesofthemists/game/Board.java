package fr.campus.chroniclesofthemists.game;

import fr.campus.chroniclesofthemists.cell.*;

import java.util.ArrayList;
import java.util.Scanner;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class Board {
    private ArrayList<Cell> board;

    public Board() {
        this.initBoard();
    }

    public ArrayList<Cell> initBoard() {
        board = new ArrayList<>();

        while (board.size() < 2) {
//            for (int i = 0; i <= 16; i++) {
//                WeaponCell weaponCell = new WeaponCell();
//                board.add(weaponCell);
//            }
//            for (int i = 0; i <= 8; i++) {
//                PotionCell potionCell = new PotionCell();
//                board.add(potionCell);
//            }
//            for (int i = 0; i <= 24; i++) {
                EnemyCell enemyCell = new EnemyCell();
                board.add(enemyCell);
//            }

            EmptyCell emptyCell = new EmptyCell();
            board.add(emptyCell);
        }
        message(board.size() + " cells created");
        return board;
    }

    public void displayBoard() {
        for (Cell cell : board) {
            int index = board.indexOf(cell);
            message("Cell n°" + index);
            message(cell.getEffect());
        }
    }

    public ArrayList<Cell> deleteCell() {

        this.displayBoard();
        Scanner input = new Scanner(System.in);
        message("Which cell do you want to delete? ");

        int cellIndex = input.nextInt();
        board.remove(cellIndex);
        message("Updated board: ");
        this.displayBoard();
        return board;
    }
}
