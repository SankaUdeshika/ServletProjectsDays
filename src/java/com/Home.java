package com;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Home", value = "/home")
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            ServletConfig config = getServletConfig();
        Enumeration<String> e = config.getInitParameterNames();
        while (e.hasMoreElements()) {
            String name = e.nextElement();
            System.out.println("name : " + name + " value - " + config.getInitParameter(name));
        }
    }

}
