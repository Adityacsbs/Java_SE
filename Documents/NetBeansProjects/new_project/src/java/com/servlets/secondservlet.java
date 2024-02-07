
package com.servlets;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.util.Date;


public class secondservlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     System.out.println("this servlet using generic  ");
     System.out.println("Servlet 2 ");
     
     res.setContentType("text/html");
     
     PrintWriter aa =res.getWriter();
     
     aa.println("<h1>current time is "+ new Date().toString() +"</h1>");
aa.println("""
           <style>
                   .container {
                       width: 300px;
                       margin: 0 auto;
                       padding: 20px;
                       border: 1px solid #ccc;
                       border-radius: 5px;
                   }
                   label {
                       display: block;
                       margin-bottom: 5px;
                   }
                   input[type="text"],
                   input[type="password"] {
                       width: 100%;
                       padding: 10px;
                       margin-bottom: 10px;
                       border: 1px solid #ccc;
                       border-radius: 5px;
                   }
                   input[type="submit"] {
                       width: 100%;
                       padding: 10px;
                       border: none;
                       border-radius: 5px;
                       background-color: #007bff;
                       color: #fff;
                       cursor: pointer;
                   }
                   input[type="submit"]:hover {
                       background-color: #0056b3;
                   }
               </style>
           </head>
           <body>
               <div class="container">
                   <h2>Registration Form</h2>
                   <form id="registrationForm" method="post" action="submit_registration.php">
                       <label for="username">Username:</label>
                       <input type="text" id="username" name="username" placeholder="Enter your username">
                       
                       <label for="email">Email:</label>
                       <input type="text" id="email" name="email" placeholder="Enter your email">
                       
                       <label for="password">Password:</label>
                       <input type="password" id="password" name="password" placeholder="Enter your password">
                       
                       <label for="confirm_password">Confirm Password:</label>
                       <input type="password" id="confirm_password" name="confirm_password" placeholder="Confirm your password">
                       
                       <input type="submit" value="Register">
           <h1>Login Page <a href="http://localhost:9494/new_project/webb" > here</a></h1>
           <h2>Home Page <a href="http://localhost:9494/new_project/" > here</a></h2>
                   </form>
               </div>
           </body>""");
     
     
     
    }
    
}
