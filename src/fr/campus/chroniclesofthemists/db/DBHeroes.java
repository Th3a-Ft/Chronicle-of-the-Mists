package fr.campus.chroniclesofthemists.db;

import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.io.CharConversionException;
import java.sql.*;
import java.util.ArrayList;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class DBHeroes extends DBConnexion{
    public DBHeroes() {};

    public ArrayList<Character> getHeroes() {
        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            ArrayList<Character> heroes = new ArrayList<>();
            Statement statement = connexion.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM `character`");
            message("List of all the heroes available: ");
            while (results.next()) {
                //heroes.add()
                message(results.getString("name") + " the " + results.getString("type"));
                message("HP: " + results.getInt("lifePoints") + " Attack " + results.getInt("strength"));
                message("Offensive Equipment: " + results.getString("offensiveEquipment") + " Defensive Equipment " + results.getString("defensiveEquipment"));
            }

            connexion.close();
        } catch (SQLException e) {
            message(e.getMessage());
        }
        return ;
    }

    public void createHeroes(Character character) throws IllegalAnswerException {
        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            PreparedStatement statement = connexion.prepareStatement("INSERT INTO `character`(type,name,lifePoints,strength,offensiveEquipment,defensiveEquipment) VALUES (?, ?,?,?,?,?) ");

            statement.setString(1, character.getType());
            statement.setString(2, character.getName());
            statement.setInt(3, character.getHP());
            statement.setInt(4, character.getAttack());
            statement.setString(5, character.getOffensiveEquipment());
            statement.setString(6, character.getDefensiveEquipment());
            statement.executeUpdate();

            connexion.close();

        } catch (SQLException e) {
            message(e.getMessage());
        }
    }
}
