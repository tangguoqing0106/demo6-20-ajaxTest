package com.itszt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018\6\21 0021.
 */
@WebServlet(name = "GetPostServlet",
urlPatterns = {
        "/GetPostServlet"
}
)
public class GetPostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("username");
        String pwd=request.getParameter("userpwd");
        response.getWriter().write("服务器post方式提交的数据 name="+name+" pwd="+pwd);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("username");
        String pwd=request.getParameter("userpwd");
        response.getWriter().write("服务器get方式提交的数据 name="+name+" pwd="+pwd);


    }
}
