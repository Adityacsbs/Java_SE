package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class fourthservlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
                       .playlist {
                           width: 100%;
                           margin-bottom: 20px;
                           padding: 10px;
                           border: 1px solid #ccc;
                           box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                       }
                       .playlist h2 {
                           margin: 0;
                           font-size: 20px;
                       }
                       .video {
                           display: flex;
                           align-items: center;
                           margin-bottom: 10px;
                       }
                       .video img {
                           width: 120px;
                           height: 90px;
                           margin-right: 10px;
                       }
                       .video p {
                           margin: 0;
                           font-size: 16px;
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
                       <a href="http://localhost:9494/Youtube1/web3">Subscriptions</a>
                       <a href="#library">Library</a>
                      <a href="http://localhost:9494/Youtube1">Start</a>
                      
                   </div>
                   <div class="container" id="library">
                       <h2 style="text-align: center;">Your Library</h2>
                       <div class="playlist">
                           <h3>Playlist Name 1</h3>
                           <div class="video">
                               <img src="https://via.placeholder.com/120x90" alt="Video Thumbnail">
                               <p>Video Title 1</p>
                           </div>
                           <div class="video">
                               <img src="https://via.placeholder.com/120x90" alt="Video Thumbnail">
                               <p>Video Title 2</p>
                           </div>
                           <!-- Additional videos in playlist 1 -->
                       </div>
                       <div class="playlist">
                           <h3>Playlist Name 2</h3>
                           <div class="video">
                               <img src="https://via.placeholder.com/120x90" alt="Video Thumbnail">
                               <p>Video Title 1</p>
                           </div>
                           <div class="video">
                               <img src="https://via.placeholder.com/120x90" alt="Video Thumbnail">
                               <p>Video Title 2</p>
                           </div>
                           <!-- Additional videos in playlist 2 -->
                       </div>
                       <!-- Additional playlists -->
                   </div>
                   <!-- Other sections -->
               </body>""");
    
    
    }
    
    
    
}
