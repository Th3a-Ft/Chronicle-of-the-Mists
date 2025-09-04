package fr.campus.chroniclesofthemists.db;

import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.character.Warrior;
import fr.campus.chroniclesofthemists.character.Witcher;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.io.CharConversionException;
import java.sql.*;
import java.util.ArrayList;

import static fr.campus.chroniclesofthemists.game.Menu.message;

public class DBHeroes extends DBConnexion {
    public DBHeroes() {
    }

    ;

    public ArrayList<Character> getHeroes() {
        ArrayList<Character> heroes = new ArrayList<>();
        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            Statement statement = connexion.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM `character`");
            message("List of all the heroes available: ");
            while (results.next()) {

                if (results.getString("type").equalsIgnoreCase("witcher")) {
                    Witcher hero = new Witcher(results.getString("name"));
                    results.getString("name");
                    results.getString("type");
                    results.getInt("lifePoints");
                    results.getInt("strength");
                    results.getString("offensiveEquipment");
                    results.getString("defensiveEquipment");
                    heroes.add(hero);

                } else {
                    Warrior hero = new Warrior(results.getString("name"));
                    results.getString("name");
                    results.getString("type");
                    results.getInt("lifePoints");
                    results.getInt("strength");
                    results.getString("offensiveEquipment");
                    results.getString("defensiveEquipment");
                    heroes.add(hero);
                }

                message(results.getString("name") + " the " + results.getString("type"));
                message("HP: " + results.getInt("lifePoints") + " Attack: " + results.getInt("strength"));
                message("Offensive Equipment: " + results.getString("offensiveEquipment") + " // Defensive Equipment " + results.getString("defensiveEquipment"));
            }

            //message("All the characters available" + heroes);

            connexion.close();
        } catch (SQLException e) {
            message(e.getMessage());
        }
        return heroes;
    }

    public void createHeroes(Character character) throws IllegalAnswerException {
        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            PreparedStatement statement = connexion.prepareStatement("INSERT INTO `character`(type,name,lifePoints,strength,offensiveEquipment,defensiveEquipment) VALUES (?, ?,?,?,?,?) ");

            statement.setString(1, character.setType());
            statement.setString(2, character.getName());
            statement.setInt(3, character.getHP());
            statement.setInt(4, character.getAttack());
            statement.setString(5, character.getOffensiveEquipment());
            statement.setString(6, character.getDefensiveEquipment());
            statement.executeUpdate();

            message("Creation successful");

            connexion.close();

        } catch (SQLException e) {
            message(e.getMessage());
        }
    }
}
