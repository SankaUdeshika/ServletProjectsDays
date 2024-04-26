<%-- 
    Document   : register
    Created on : Apr 26, 2024, 2:53:05 PM
    Author     : sanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Page</h1>

        <form action="register" method="post">
            <table border="1">
                <thead>
                    <tr>
                        <th>Email</th>
                        <td><input type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="name"/></td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <th>Contact</th>
                        <td><input type="password" name="contact"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="submit"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
