package fr.campus.chroniclesofthemists.db;

import fr.campus.chroniclesofthemists.cell.*;
//import fr.campus.chroniclesofthemists.equipment.Potion;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;
import fr.campus.chroniclesofthemists.game.Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class DBBoard extends DBConnexion {
    public DBBoard() {
    }

    ;

    public void BoardToDB(Game game) {
        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            PreparedStatement statement = connexion.prepareStatement("INSERT INTO `board`(cell, effect, type) VALUES (?, ?, ?)");

            ArrayList<Cell> board = game.createBoard();

            for (int i = 0; i < board.size(); i++) {
                Cell cell = board.get(i);

                statement.setInt(1, i);

                if (cell instanceof EmptyCell) {
                    statement.setString(2, cell.toString());
                    statement.setString(3, "empty");
                } else if (cell instanceof EnemyCell) {
                    statement.setString(2, cell.toString());
                    statement.setString(3, "enemy");
                } else if (cell instanceof PotionCell) {
                    statement.setString(2, cell.toString());
                    statement.setString(3, "potion");
                } else if (cell instanceof WeaponCell) {
                    statement.setString(2, cell.toString());
                    statement.setString(3, "weapon");
                }
                statement.executeUpdate();
            }

            connexion.close();

        } catch (SQLException e) {
            message(e.getMessage());
        }
    }

}
