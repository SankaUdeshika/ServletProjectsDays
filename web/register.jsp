<%-- 
    Document   : register
    Created on : Apr 24, 2024, 2:25:33 PM
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
        <h1>Register </h1>

        <form action="register" method="post">
            <table>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <th>email</th>
                    <td><input type="text" name="email"/></td>
                </tr>
                <tr>
                    <th>contact</th>
                    <td><input type="text" name="contact"/></td>
                </tr>
                <tr>
                    <th>password</th>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
