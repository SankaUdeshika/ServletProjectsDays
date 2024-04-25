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
import java.util.List;

@WebServlet(name = "Login", value = "/login")
public class login extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        System.out.println(context.getAttribute("users"));

//        User user = null;
//
//        if (context.getAttribute("users") != null) {
//
//            List<User> users = (ArrayList<User>) context.getAttribute("users");
//
//            for (User u : users) {
//                if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
//                    user = u;
////                    resp.getWriter().write("Hello ," + user.getName());
//                    break;
//                }
//            }
//            if (user != null) {
//                resp.getWriter().write("Hello , " + user.getName());
//            } else {
//                resp.getWriter().write("Invalid Email Or Passowrd");
//            }
//
//        } else {
//            resp.sendRedirect("index.jsp");
//        }
    }
    
}
