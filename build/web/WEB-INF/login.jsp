<%-- 
    Document   : login
    Created on : 9-Oct-2022, 2:37:14 PM
    Author     : Eric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post">
            Username: <input type="text" name="username" value="${user.username}"><br>
            Password: <input type="text" name="password" value="${user.password}"><br>
            <input type="submit" value="Login">
        </form>
        <p>${message}</p>
    </body>
</html>
