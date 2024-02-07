package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class thirdservlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("hello this is 3 servlet using HTTP ");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<h1 style=\"color: #007bff;\">This is third servlet using HTTP... </h1>");

        out.print("""
                 <style>
                    .container {
                        width: 80%;
                        margin: 0 auto;
                        padding: 20px;
                        border: 1px solid #ccc;
                        border-radius: 5px;
                        background-color: #f9f9f9;
                    }
                    label {
                        font-weight: bold;
                    }
                    input[type="text"],
                    textarea {
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
                         <h2 style=\"color: #007bff;\">Contact Us</h2>
                         <form id="contactForm" onsubmit="return validateForm()" method="post" action="submit_contact.php">
                             <label for="name">Name:</label>
                             <input type="text" id="name" name="name" placeholder="Enter your name" required>
                             
                             <label for="email">Email:</label>
                             <input type="text" id="email" name="email" placeholder="Enter your email" required>
                             
                             <label for="message">Message:</label>
                             <textarea id="message" name="message" placeholder="Enter your message" rows="4" required></textarea>
                             
                             <input type="submit" value="Submit" style=\"background-color: #007bff;\">
                             <h1 style=\"color: #007bff;\">Login Page <a href="http://localhost:9494/new_project/webb" style=\"color: #007bff;\"> here</a></h1>
                             <h2 style=\"color: #007bff;\">Home Page <a href="http://localhost:9494/new_project/" style=\"color: #007bff;\"> here</a></h2>
                   <h2  style=\"color: #007bff;">Registeration <a href="http://localhost:9494/new_project/web2" style=\"color: #007bff;\"   >here</a></h2>
                         </form>
                     </div>
                 
                     <script>
                         function validateForm() {
                             var name = document.getElementById('name').value;
                             var email = document.getElementById('email').value;
                             var message = document.getElementById('message').value;
                 
                             if (name == "" || email == "" || message == "") {
                                 alert("Please fill in all fields.");
                                 return false;
                             }
                 
                             return true;
                         }
                     </script>
                 
                 </body>""");

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

}
