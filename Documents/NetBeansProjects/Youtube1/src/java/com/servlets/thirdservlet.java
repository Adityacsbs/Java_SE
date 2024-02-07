package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class thirdservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          resp.setContentType("text/html");
            PrintWriter ok = resp.getWriter();
            
            ok.println("""
                         <style>
                               body {
                                   font-family: Arial, sans-serif;
                                   margin: 0;
                                   padding: 0;
                               }
                               .header {
                                   background-color: #ff0000;
                                   padding: 10px;
                                   color: #fff;
                                   text-align: center;
                               }
                               .nav {
                                   background-color: #333;
                                   color: #fff;
                                   padding: 10px 0;
                                   text-align: center;
                               }
                               .nav a {
                                   color: #fff;
                                   text-decoration: none;
                                   padding: 10px 20px;
                               }
                               .container {
                                   max-width: 1200px;
                                   margin: 20px auto;
                                   padding: 20px;
                                   border: 1px solid #ccc;
                               }
                               .channel {
                                   width: 100%;
                                   max-width: 300px;
                                   margin: 0 auto;
                                   margin-bottom: 20px;
                                   padding: 10px;
                                   border: 1px solid #ccc;
                                   box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                                   text-align: center;
                               }
                               .channel img {
                                   width: 100px;
                                   height: 100px;
                                   border-radius: 50%;
                               }
                               .channel h3 {
                                   margin: 5px 0;
                                   font-size: 16px;
                               }
                               .channel p {
                                   margin: 5px 0;
                                   font-size: 14px;
                                   color: #666;
                               }
                           </style>
                       </head>
                       <body>
                           <div class="header">
                               <h1>YouTube</h1>
                           </div>
                           <div class="nav">
                               <a href="http://localhost:9494/Youtube1/web1">Home</a>
                               <a href="http://localhost:9494/Youtube1/web2">Trending</a>
                               <a href="#subscriptions">Subscriptions</a>
                               <a href="http://localhost:9494/Youtube1/web4">Library</a>
                               <a href="http://localhost:9494/Youtube1">Start</a>
                           </div>
                           <div class="container" id="subscriptions">
                               <h2 style="text-align: center;">Your Subscriptions</h2>
                               <div class="channel">
                                   <img src="https://via.placeholder.com/100" alt="Channel Logo">
                                   <h3>Channel Name</h3>
                                   <p>100K subscribers</p>
                               </div>
                               <div class="channel">
                                   <img src="https://via.placeholder.com/100" alt="Channel Logo">
                                   <h3>Channel Name</h3>
                                   <p>50K subscribers</p>
                               </div>
                               <!-- Additional subscription channels -->
                           </div>
                           <!-- Other sections -->
                       </body>""");


    }
    
    
}
