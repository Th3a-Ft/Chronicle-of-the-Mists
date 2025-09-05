package fr.campus.chroniclesofthemists.db;

import fr.campus.chroniclesofthemists.character.Character;
import fr.campus.chroniclesofthemists.character.Warrior;
import fr.campus.chroniclesofthemists.character.Witcher;
import fr.campus.chroniclesofthemists.exception.IllegalAnswerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

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

                message("id: " + results.getString("id"));
                message(results.getString("name") + " the " + results.getString("type"));
                message("HP: " + results.getInt("lifePoints") + " Attack: " + results.getInt("strength"));
                message("Offensive Equipment: " + results.getString("offensiveEquipment") + " // Defensive Equipment " + results.getString("defensiveEquipment"));
            }

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

    public void editHeroes() {
        Scanner input = new Scanner(System.in);

        try (Connection connexion = DriverManager.getConnection(getURL(), getUser(), getPassword())) {
            Statement statement = connexion.createStatement();

            message("Which character would you like to update? (type his id number)");
            int id = input.nextInt();

            ResultSet results = statement.executeQuery("SELECT * FROM `character` WHERE id =" + id);

            input.nextLine();
            //String continueUpdate = input.nextLine();


            if (results.next()) {
                while (continueUpdating()) {
                    message("What do you want to update? (type the number)");
                    message("1 - Update type");
                    message("2 - Update name");
                    message("3 - Update life points");
                    message("4 - Update strength");
                    message("5 - Update offensive equipment");
                    message("6 - Update defensive equipment");


                    String characterType = results.getString("type");
                    String name = results.getString("name");
                    int lifePoints = results.getInt("lifePoints");
                    int strength = results.getInt("strength");
                    String offensiveEquipment = results.getString("offensiveEquipment");
                    String defensiveEquipment = results.getString("defensiveEquipment");

                    int choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {
                        case 1:
                            message("Update the type of your character (type Warrior or Witcher):");
                            characterType = input.nextLine();
                            message("You are now a " + characterType);
                            break;
                        case 2:
                            message("Update the name of your character:");
                            name = input.nextLine();
                            message("Your name is now " + name);
                            break;
                        case 3:
                            message("Update your life points:");
                            lifePoints = input.nextInt();
                            message("Your life points are now " + lifePoints);
                            break;
                        case 4:
                            message("Update your strength:");
                            strength = input.nextInt();
                            message("Your strength points are now " + strength);
                            break;
                        case 5:
                            message("Update your offensive equipment:");
                            offensiveEquipment = input.nextLine();
                            message("Your life points are now " + offensiveEquipment);
                            break;
                        case 6:
                            message("Update your defensive equipment:");
                            defensiveEquipment = input.nextLine();
                            message("Your life points are now " + defensiveEquipment);
                            break;
                        default:
                            message("No update made");
                            continueUpdating();
                    }
                    String sql = "UPDATE `character` SET type = ?, name = ?, lifePoints= ?, strength= ?, offensiveEquipment= ?, defensiveEquipment= ? WHERE id = ?";
                    PreparedStatement preparedStatement = connexion.prepareStatement(sql);
                    preparedStatement.setString(1, characterType);
                    preparedStatement.setString(2, name);
                    preparedStatement.setInt(3, lifePoints);
                    preparedStatement.setInt(4, strength);
                    preparedStatement.setString(5, offensiveEquipment);
                    preparedStatement.setString(6, defensiveEquipment);
                    preparedStatement.setInt(7, id);
                    preparedStatement.executeUpdate();
                }
            } else {
                message("This id doesn't exist");
            }


            connexion.close();

        } catch (SQLException e) {
            message(e.getMessage());
        }
    }

    private boolean continueUpdating() {
        Scanner input = new Scanner(System.in);
        message("Continue update? (yes/no)");
        String update = input.nextLine();
        if (update.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }

    }
}
