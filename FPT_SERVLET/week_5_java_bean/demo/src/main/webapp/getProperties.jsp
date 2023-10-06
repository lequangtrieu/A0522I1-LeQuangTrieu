<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/3/2023
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Properties JSP</title>
</head>
<body>
<jsp:useBean id="user" class="model.User" scope="application"></jsp:useBean>
<h1>
    First Name: <jsp:getProperty name="user" property="firstName"/>
    <br><br>
    Last Name: <jsp:getProperty name="user" property="lastName"/>
    <br><br>
    UserName: <jsp:getProperty name="user" property="userName"/>
    <br><br>
    Password: <jsp:getProperty name="user" property="password"/>
</h1>

</body>
</html>
