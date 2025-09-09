package fr.campus.chroniclesofthemists.db;


public class DBConnexion {
    private static String URL = "jdbc:mysql://localhost:3306/COTM";
    private static String USER = "theaf";
//    private static String USER = "root";
    private static String PASSWORD = "theaf";
 //   private static String PASSWORD = "root";

    public DBConnexion() {};

    protected String getURL(){
        return URL;
    }

    protected String getUser(){
        return USER;
    }

    protected String getPassword(){
        return PASSWORD;
    }

    public static void main(String[] args)  {
//        try (Connection connexion = DriverManager.getConnection(URL, USER, PASSWORD)) {
//
//            message("Connection established");
//            Statement statement = connexion.createStatement();
//            ResultSet results = statement.executeQuery("SELECT * FROM `character`");
//
//            message("sql: " + results);
//
//            connexion.close();
//        } catch (SQLException e) {
//            message(e.getMessage());
//        }

    }







}
