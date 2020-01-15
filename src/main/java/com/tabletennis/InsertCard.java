package com.tabletennis;

import org.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class InsertCard extends HttpServlet {
    public InsertCard()
    {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataBase db = new DataBase();
        try {
            JSONArray jsonArray = db.display();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
