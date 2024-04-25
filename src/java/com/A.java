package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "A", value = "/A")
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resposne) throws ServletException, IOException {
        Cookie c = new Cookie("name", "WCD");

//        c.setAttribute("Path", "/app");
//        c.setValue("ChangedValue");
//        c.setPath(getServletContext().getContextPath() + "/login");
//        c.setPath("/WebText/login");
//        c.setDomain("google.com"); // set Domain name. reject wenawa thiyena DOmain ekath ekka wenas wena nisa
//        c.setMaxAge(10); // expire Time (-1 thibboth save wenne na) (0 imidiate Remove wenawa) (1< dammoth eka e time wenakn thiyenawa)
//        c.setHttpOnly(true); // http walata witharai wada karanne
        c.setSecure(true); // https walata wtharak da naththan http walata witharak da wada karanne kiyala danna puluwan

        resposne.addCookie(c);
    }
}
