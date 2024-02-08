package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class successregister extends HttpServlet {

   

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 resp.setContentType("text/html");
        
        PrintWriter ok = resp.getWriter();
        
        ok.println("<h1>You are successfully registered here</h1>");
        
       ok.println("<a href=\"/RegisterServlet\"><h1>click here</h1></a>");

    }
    
    
}
