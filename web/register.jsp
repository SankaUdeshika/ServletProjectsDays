<%-- 
    Document   : register
    Created on : Mar 27, 2024, 8:47:19 AM
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
        <h1>Register</h1>

        <form action="register" method="post">
            <table>
                <tr>
                    <th>Name</th>
                    <th><input type="type" name="name"></th>
                </tr>

                <tr>
                    <th>Contact</th>
                    <th><input type="type" name="contact"></th>
                </tr>

                <tr>
                    <th>Email</th>
                    <th><input type="type" name="email"></th>
                </tr>

                <tr>
                    <th>password</th>
                    <th><input type="password" name="password"></th>
                </tr>

                <tr>
                    <th><input type="submit" value="Register"/></th>
                </tr>

            </table>
        </form>

    </body>
</html>
