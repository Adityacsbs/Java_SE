package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import java.util.Random;



public class firstservlet implements Servlet {
    //life cycle methods
ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("creating new servlet");
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servicing servlet 1 ..........");
        //set the content type of the response
        res.setContentType("text/html");
        
        PrintWriter ok = res.getWriter();
        
        ok.println("<h1>helllo this is from dynamic side response....</h1>");
        ok.println("<h2>today date and time is :- "+new Date().toString()+"</h2>");
        ok.println("""
                     <style>
                             .login {
                                 width: 300px;
                                 margin: 0 auto;
                                 padding: 20px;
                                 border: 1px solid #ccc;
                                 border-radius: 5px;
                             }
                             label {
                                 font-weight: bold;
                             }
                             input[type="text"],
                             input[type="password"] {
                                 width: 100%;
                                 padding: 10px;
                                 margin: 5px 0;
                                 border: 1px solid #ccc;
                                 border-radius: 5px;
                             }
                             input[type="button"] {
                                 width: 100%;
                                 padding: 10px;
                                 margin: 5px 0;
                                 border: none;
                                 border-radius: 5px;
                                 background-color: #007bff;
                                 color: #fff;
                                 cursor: pointer;
                             }
                             input[type="button"]:hover {
                                 background-color: #0056b3;
                             }
                             #check {
                                 margin-right: 5px;
                             }
                             a {
                                 text-decoration: none;
                                 color: #007bff;
                             }
                             a:hover {
                                 text-decoration: underline;
                             }
                         </style>
                     </head>
                     <body>
                         <h2>Login Page</h2>
                         <div class="login">
                             <form id="login" method="get" action="login.php">
                                 <label><b>User Name</b></label>
                                 <input type="text" name="Uname" id="Uname" placeholder="Username"><br><br>
                                 <label><b>Password</b></label>
                                 <input type="Password" name="Pass" id="Pass" placeholder="Password"><br><br>
                                 <input type="button" name="log" id="log" value="Log In Here"><br><br>
                                 <input type="checkbox" id="check">
                                 <span>Remember me</span><br><br>
                                 Forgot <a href="http://localhost:9494/new_project">Password</a>
                                 <h2>Registeration <a href="http://localhost:9494/new_project/web2"   >here</a></h2>
                   
                   <h2>Home Page <a href="http://localhost:9494/new_project/" > here</a></h2>
                   <h1> <a href="http://localhost:9494/new_project/web3">contact page </a></h1>
                             </form>
                         </div>
                     </body>""");
         Random rand = new Random(); 
         int a = rand.nextInt(100);
         System.out.println("Random Integers: "+a);
         ok.println("<h1>random number is : "+a+"</h1>");
        
      //  throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void destroy() {
        System.out.println("destroy hone wala hai ");
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getServletInfo() {
        return "this servelet is created by aadityaraj singh chouhan";
        
        }
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    
}
