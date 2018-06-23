package com.itszt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018\6\20 0020.
 */
@WebServlet(name = "OldAjaxServlet",
urlPatterns={
        "/OldAjaxServlet"
}
)
public class OldAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("username");
        String pwd=request.getParameter("userpwd");
        response.getWriter().write("我是服务器post方式的数据!name="+name+"  pwd="+pwd);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("username");
        String pwd=request.getParameter("userpwd");
        response.getWriter().write("我是服务器get方式的数据!name="+name+"  pwd="+pwd);
    }
}
