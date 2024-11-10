package com.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String URL = "jdbc:mysql://localhost:3306/web";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "28112004";
    
    private boolean validateUser(String userName, String password) {
        boolean isValid = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userName);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            isValid = resultSet.next();

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception except) {
            System.out.println("Error occurred during database operation.");
            except.printStackTrace();
        }
        
        return isValid;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("<html><head><style>");
        response.getWriter().println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
        response.getWriter().println(".container { width: 400px; margin: 50px auto; padding: 20px; background: white; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
        response.getWriter().println(".success { color: #FFB3BA; }");
        response.getWriter().println(".greeting { color: #D5C9E0; }");
        response.getWriter().println(".error { color: red; }");
        response.getWriter().println("</style></head><body>");

        if(validateUser(userName, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            
            response.getWriter().println("<div class='container'>");
            response.getWriter().println("<h1 class='success'>Đăng nhập thành công!</h1>");
            response.getWriter().println("<h2 class='greeting'>Xin chào, " + userName + "!</h2>");
            response.getWriter().println("</div>");
        } else {
            response.getWriter().println("<div class='container'>");
            response.getWriter().println("<h1 class='error'>Đăng nhập thất bại!</h1>");
            response.getWriter().println("<h2>Vui lòng kiểm tra lại tên đăng nhập và mật khẩu.</h2>");
            response.getWriter().println("</div>");
        }
        
        response.getWriter().println("</body></html>");
    }
}
