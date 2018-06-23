package com.itszt;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018\6\21 0021.
 */
@WebServlet(name = "GetStarServlet",
urlPatterns = {
        "/GetStarServlet"
}
)
public class GetStarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Connection connection = UtilDBCP.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM star");
            resultSet = preparedStatement.executeQuery();
            List<Star> stars=new ArrayList<>();
            while(resultSet.next()){
                Star star=new Star();
                star.setId(resultSet.getInt(1));
                star.setName(resultSet.getString(2));
                star.setImg(resultSet.getString(3));
                star.setDescription(resultSet.getString(4));
                stars.add(star);
            }
            //把集合变成json字串
            Gson gson=new Gson();
            String json = gson.toJson(stars);
            writer.write(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UtilDBCP.release(connection,preparedStatement,resultSet);
        }


    }
}
