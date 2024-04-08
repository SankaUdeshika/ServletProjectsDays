package com;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import java.util.Enumeration;

//@WebServlet(name = "Login", value = "/login", initParams = {
//    @WebInitParam(name = "name", value = "WCD"),
//    @WebInitParam(name = "db", value = "web_db")
//})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
//        context.setAttribute("name", "Java Web Application");
        String a = context.getInitParameter("a");
        System.out.println(a);
//        System.out.println(context);
    }
}
