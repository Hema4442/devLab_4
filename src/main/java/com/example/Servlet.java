package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Devops Lab 4</title></head><body>");
        out.println("<h1>Welcome to Tomcat</h1>");
        out.println("<ul>");
        out.println("<li>Jereme</li>");
        out.println("<li>2021WB86864</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

