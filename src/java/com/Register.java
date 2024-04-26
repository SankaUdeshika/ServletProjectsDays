package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Register", value = "/register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String contact = req.getParameter("contact");

        ServletContext context = getServletContext();
        List<User> users = new ArrayList<>();

        if (context.getAttribute("useres") != null) {
            System.out.println("OLD List");
            users = (ArrayList<User>) context.getAttribute("useres");
        } else {
            System.out.println("NewList List");
            context.setAttribute("useres", users);
        }

        User user = new User(name, email, password, contact);

        users.add(user);
        System.out.println(user.getEmail());
        System.out.println(users.size());
        System.out.println(users);
        System.out.println(user.getEmail());

        //        System.out.println(context.getAttribute("users"));
        //
        //        resp.sendRedirect("index.jsp");
    }

}
