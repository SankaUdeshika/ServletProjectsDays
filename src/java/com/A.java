package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "A", value = "/A")
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resposne) throws ServletException, IOException {

        HttpSession session = request.getSession(); // This is the way How To create a Session ID
        session.setAttribute("name", "HadapuSessionEka");
//        System.out.println(session.getId());

        Cookie c = new Cookie("JSESSIONID", "HadapuCookieeka");
        c.setMaxAge(3600);
        c.setHttpOnly(true);
        c.setPath(getServletContext().getContextPath());

        resposne.addCookie(c);
        System.out.println(c);
    }
}
