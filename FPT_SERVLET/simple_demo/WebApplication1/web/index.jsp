<%-- 
    Document   : index
    Created on : Sep 1, 2023, 1:10:01 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>My First JSP</h1>
        <hr/>
        <h2>The current time: </h2>
        <br/> 
        Time on server is <%= new java.util.Date() %>
    </body>
</html>
