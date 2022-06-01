package com.example.web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void init() {
        System.out.println("Init!!!");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("doGet!!!");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor=\"yellow\">Hello Servlet!</body></html>");
    }

    public void destroy() {
        System.out.println("destroy!!!");
    }
}