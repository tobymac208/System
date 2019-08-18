package com.projects.codepractitioner.POJOs.Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for communicating with a database.
 */
public class DatabaseConnection {
    private static Connection connect;

    public DatabaseConnection(){
        createConnection(); // create the connection
    }

    /** Create connection for database */
    void createConnection(){
        // Connect to database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Main", "root", "Sparta_!3712");

            System.out.println("Successfully connected to database.");
        }catch (ClassNotFoundException e){
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException e){
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }

    /** Write to the database */
    public void writeToDatabase(){
        try{
            // Create a sql statement
            Statement query = connect.createStatement();

            // Insert/Update data in database
            query.executeUpdate("INSERT INTO login_accounts VALUES('username', 'password', 'first', 'last', 21, 0);");
        }catch (SQLException e){
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }
}
