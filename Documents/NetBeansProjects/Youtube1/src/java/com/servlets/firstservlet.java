package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;



public class firstservlet extends HttpServlet  {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("hello start");
       resp.setContentType("text/html");
       
       PrintWriter ok=resp.getWriter();
       
       
      
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
                          .container {
                              max-width: 1200px;
                              margin: 20px auto;
                              padding: 20px;
                              border: 1px solid #ccc;
                          }
                          .video {
                              width: 100%;
                              max-width: 600px;
                              margin: 0 auto;
                              margin-bottom: 20px;
                              padding: 10px;
                              border: 1px solid #ccc;
                              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                          }
                          .video img {
                              width: 100%;
                              height: auto;
                          }
                          .video h3 {
                              margin: 5px 0;
                              font-size: 18px;
                          }
                          .video p {
                              margin: 5px 0;
                              font-size: 14px;
                              color: #666;
                          }
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
                          nav {
                              background-color: #333;
                              color: #fff;
                              padding: 10px 0;
                              text-align: center;
                          }
                          nav a {
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
                          .video {
                              width: 100%;
                              max-width: 600px;
                              margin: 0 auto;
                              margin-bottom: 20px;
                              padding: 10px;
                              border: 1px solid #ccc;
                              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                          }
                          .video img {
                              width: 100%;
                              height: auto;
                          }
                          .video h3 {
                              margin: 5px 0;
                              font-size: 18px;
                          }
                          .video p {
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
                      <nav>
                          <a href="#home">Home</a>
                          <a href="http://localhost:9494/Youtube1/web2">Trending</a>
                          <a href="http://localhost:9494/Youtube1/web3">Subscriptions</a>
                          <a href="http://localhost:9494/Youtube1/web4">Library</a>
                          <a href="http://localhost:9494/Youtube1">Start</a>
                      </nav>
                      <div class="container" id="home">
                          <div class="video">
                  
                              <img src="" alt="Video Thumbnail">
                              <h3>Video Title</h3>
                              <p>Channel Name</p>
                              <p>100K views • 2 days ago</p>
                          </div>
                          <!-- Additional videos -->
                      </div>
                      
                      <div class="container">
                          <div class="video">
                              <img src="https://via.placeholder.com/600x300" alt="Video Thumbnail">
                              <h3>Video Title</h3>
                              <p>Channel Name</p>
                              <p>100K views \u2022 2 days ago</p>
                          </div>
                          <div class="video">
                              <img src="https://via.placeholder.com/600x300" alt="Video Thumbnail">
                              <h3>Video Title</h3>
                              <p>Channel Name</p>
                              <p>200K views \u2022 1 week ago</p>
                          </div>
                          <div class="video">
                              <img src="https://via.placeholder.com/600x300" alt="Video Thumbnail">
                              <h3>Video Title</h3>
                              <p>Channel Name</p>
                              <p>50K views \u2022 1 month ago</p>
                          </div>
                      </div>
                  </body>""");
       
       //including index page by help of requestdispatcher
       
      RequestDispatcher rd = req.getRequestDispatcher("index.html");
      
      //include
      
      rd.include(req, resp);

    }
    
}
