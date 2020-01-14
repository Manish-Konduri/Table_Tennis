package com.tabletennis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
@WebServlet(name="log",urlPatterns = "/log")
public class LoginPlayer extends HttpServlet {
    public LoginPlayer()
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        DataBase db = new DataBase();
        String email = request.getParameter("Email");
        String password = request.getParameter("pwd");
        Statement statement;
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // Connects to mysql service through a connection url and credentials
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "manishk", "manish@145#");
            statement = connection.createStatement();
            String q = "select * from teamplayer where Email='" + email + "' and password= '" + password + "'";
            ResultSet rs = statement.executeQuery(q);
            if (rs.next()) {
                resp.getWriter().write("Success");
            } else
                resp.getWriter().write("Failure");
        }
            catch (Exception e){
                System.out.println("No Table");
            }

    }
}
