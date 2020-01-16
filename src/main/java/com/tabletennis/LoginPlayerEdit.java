package com.tabletennis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginPlayerEdit extends HttpServlet {
    public LoginPlayerEdit()
    {

    }
//UPDATE teamplayer SET Name="KONDURI" WHERE Name="erhgsdf";
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        DataBase db = new DataBase();
        String playerName = request.getParameter("Name");
        String newPlayerName=request.getParameter("newName");
        String phone = request.getParameter("Phone");
        String email = request.getParameter("Email");
        String password = request.getParameter("pwd");
        String teamName="";
        if(newPlayerName.length()>0) {
            String q = "UPDATE teamplayer SET Name='" + newPlayerName + "' WHERE Name= '" + playerName + "'";
        }
        else
        {
            System.out.println("Enter valid name");
        }

    }
}
