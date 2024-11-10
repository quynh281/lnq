package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddClient {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/web"; 
        String dbUsername = "root"; 
        String dbPassword = "28112004"; 

        String ID = "3";
        String name = "quynh";
        String email = "quynh@gmail.com";
        String phone = "123-456-7890";
        String address = "123 ltt";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
             Statement statement = conn.createStatement()) {

            
            String insertClientSQL = "INSERT INTO Client (name, email, phone, address) VALUES ('" 
                + name + "', '" + email + "', '" + phone + "', '" + address + "')";
            int rowsAffected = statement.executeUpdate(insertClientSQL);
            System.out.println("Client added successfully. Rows affected: " + rowsAffected);

            
            String selectClientSQL = "SELECT * FROM Client WHERE name = '" + name + "'";
            ResultSet resultSet = statement.executeQuery(selectClientSQL);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Phone: " + resultSet.getString("phone"));
                System.out.println("Address: " + resultSet.getString("address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}