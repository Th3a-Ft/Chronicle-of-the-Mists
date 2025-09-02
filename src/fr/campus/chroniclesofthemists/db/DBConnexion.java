package fr.campus.chroniclesofthemists.db;


import java.sql.*;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class DBConnexion {
    private static final String URL = "jdbc:mysql://localhost:3306/COTM";
    private static final String USER = "theaf";
    private static final String PASSWORD = "theaf";


    public static void main(String[] args) {
        // Connexion connexion = null;
        //Statement statement = null;

        try (Connection connexion = DriverManager.getConnection(URL, USER, PASSWORD)) {

            message("Connection established");
            Statement statement = connexion.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM `character`");

            message("sql: " + results);

        } catch (SQLException e) {
            message(e.getMessage());
        }

    }


}
