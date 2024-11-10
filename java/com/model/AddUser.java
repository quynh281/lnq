package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddUser {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/web"; 
        String dbUsername = "root"; 
        String dbPassword = "28112004"; 

        String username = "mnn";
        String password = "2005";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
             Statement statement = conn.createStatement()) {

            
            String insertUserSQL = "INSERT INTO User (username, password) VALUES ('" + username + "', '" + password + "')";
            int rowsAffected = statement.executeUpdate(insertUserSQL);
            System.out.println("User added successfully. Rows affected: " + rowsAffected);

            
            String selectUserSQL = "SELECT * FROM User WHERE username = '" + username + "'";
            ResultSet resultSet = statement.executeQuery(selectUserSQL);
            
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Password: " + resultSet.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}