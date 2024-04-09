/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author sanka
 */
@WebServlet(name = "Register", value = "/register")
public class Register extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String passowrd = request.getParameter("passowrd");
        
        System.out.println(email);
        
        ServletContext context = getServletContext();
        
        List<User> users = new ArrayList<>();
        
        if (context.getAttribute("users") != null) {
            System.out.println("Old List");
            users = (ArrayList<User>) context.getAttribute("users");
        } else {
            System.out.println("New List");
            context.setAttribute("users", users);
        }
        
        User user = new User(name, contact, email, passowrd);
        users.add(user);
        response.sendRedirect("index.jsp");        
    }
    
}
