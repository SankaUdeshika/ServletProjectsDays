/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanka
 */
@WebServlet(name = "Register", value = "/register")
public class Register extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest reqeust, HttpServletResponse response) throws ServletException, IOException {
        String name = reqeust.getParameter("name");
        String email = reqeust.getParameter("email");
        String contact = reqeust.getParameter("contact");
        String password = reqeust.getParameter("password");
        
        ServletContext context = getServletContext();
        List<User> users = new ArrayList<>();
        
        if (context.getAttribute("useres") != null) {
            System.out.println("OLD List");
            users = (ArrayList<User>) context.getAttribute("users");
        } else {
            System.out.println("NewList List");
            context.setAttribute("users", users);
        }
        
        User user = new User(name, contact, email, password);
        
        users.add(user);
        
        System.out.println(context.getAttribute("users"));
        
        response.sendRedirect("index.jsp");
        
    }
    
}
