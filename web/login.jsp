<%-- 
    Document   : login
    Created on : Apr 24, 2024, 2:26:55 PM
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
        <h1>Login</h1>
        <form action="login" method="post">
            <table>
                <tr>
                    <th>Email</th>
                    <td><input type="text" name="email"/></td>
                </tr>
                <tr>
                    <th>password</th>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
