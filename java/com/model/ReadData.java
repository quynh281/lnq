package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true"; 
        String USER = "root"; 
        String PASSWORD = "28112004"; 

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            
            String queryUsers = "SELECT * FROM `User`";
            ResultSet rsUsers = statement.executeQuery(queryUsers);
            System.out.println("Danh sách User:");
            while (rsUsers.next()) {
                String username = rsUsers.getString("username");
                String password = rsUsers.getString("password");
                System.out.println("Username: " + username + ", Password: " + password);
            }

            
            String queryClients = "SELECT * FROM `Client`";
            ResultSet rsClients = statement.executeQuery(queryClients);
            System.out.println("Danh sách Client:");
            while (rsClients.next()) {
                int id = rsClients.getInt("id");
                String name = rsClients.getString("name");
                String email = rsClients.getString("email");
                String phone = rsClients.getString("phone");
                String address = rsClients.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phone + ", Address: " + address);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
