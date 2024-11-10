package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/web"; 
    private static final String USER = "root"; // Tên người dùng CSDL
    private static final String PASSWORD = "28112004"; // Mật khẩu CSDL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối thành công đến CSDL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
