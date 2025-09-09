package fr.campus.chroniclesofthemists.game;

import fr.campus.chroniclesofthemists.cell.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class Board {
    private ArrayList<Cell> board;

    public Board() {
        this.initBoard(64,16,8,24);
    }

    public ArrayList<Cell> initBoard(int nbreTotalCells,int nbreWeaponCells, int nbrePotionCells,int nbreEnemyCells) {
        board = new ArrayList<>();

        int nbreEmptyCells = nbreTotalCells - (nbreEnemyCells+nbrePotionCells+nbreWeaponCells);

            for (int i = 0; i < nbreWeaponCells; i++) {
                WeaponCell weaponCell = new WeaponCell();
                board.add(weaponCell);
            }
            for (int i = 0; i < nbrePotionCells; i++) {
                PotionCell potionCell = new PotionCell();
                board.add(potionCell);
            }
            for (int i = 0; i < nbreEnemyCells; i++) {
                EnemyCell enemyCell = new EnemyCell();
                board.add(enemyCell);
            }
            for (int i = 0; i < nbreEmptyCells; i++) {
                EmptyCell emptyCell = new EmptyCell();
                board.add(emptyCell);
            }
        message(board.size() + " cells created");
        Collections.shuffle(board);
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
