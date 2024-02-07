
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        resp.setContentType("text/html");
        
        PrintWriter ok =resp.getWriter();
    //    ok.println("<h1>Form submitted</h1>");
       ok.println("<h2 style=\"text-align: center\">You are registered</h2><hr><hr>");
      
       String name =req.getParameter("user_name");
       String password =req.getParameter("password");
       String email =req.getParameter("email");
       String Gender =req.getParameter("user_gen");
       String course =req.getParameter("User_course");
       
       ok.println("<h3>Name :"+name+"</h3>");
       ok.println("<h3>Password :"+password+"</h3>");
       ok.println("<h3>Email:"+email+"</h3>");
       ok.println("<h3>Gender:"+Gender+"</h3>");
       ok.println("<h3>Course:"+course+"</h3>");
       

    }
    
    
    
}
