<%-- 
    Document   : home
    Created on : 9-Oct-2022, 3:27:13 PM
    Author     : Eric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p><b>Hello ${username}!</b></p>
        <a href="/login?logout">Log out</a>
    </body>
</html>
