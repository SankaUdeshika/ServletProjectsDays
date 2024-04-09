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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println("The Email is : " + email);
        User user = null;

        if (context.getAttribute("users") != null) {
            System.out.println("Is in the System");
            List<User> users = (ArrayList<User>) context.getAttribute("users");

            for (User u : users) {
                System.out.println("User" + users);
                if (u.getEmail().equals(email) && u.getPassoword().equals(password)) {
                    System.out.println("User = u eke thama prashne");
//                    user = u;
                    break;
                }
            }

//            if (user != null) {
//                resp.getWriter().write("Hello , " + user.getName());
//            } else {
//                resp.getWriter().write("Invalid Email or Passowrd ");
//            }
        } else {
            System.out.print("Is not in the System");
            resp.sendRedirect("index.jsp");
        }
    }

}
