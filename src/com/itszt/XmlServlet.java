package com.itszt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Administrator on 2018\6\20 0020.
 */
@WebServlet(name = "XmlServlet",
urlPatterns = {
        "/XmlServlet"
}
)
public class XmlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        Dog dog=new Dog("(●—●)",10,"男");
        response.getWriter().write("{\"name\":\"(●—●)\",\"age\":\"10\",\"gender\":\"男\"}");




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/xml;charset=utf-8");
        PrintWriter writer = response.getWriter();
        String path=request.getServletContext().getRealPath("xml");
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path+"/qq.xml"),"utf-8"));
        String str=null;
        while((str=br.readLine())!=null){
            writer.write(str);
        }
        br.close();

    }
}
