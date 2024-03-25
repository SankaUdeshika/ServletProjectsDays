package com;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.ServletResponse;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() : " + Thread.currentThread().getName());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service : " + Thread.currentThread().getName());
    }

}
