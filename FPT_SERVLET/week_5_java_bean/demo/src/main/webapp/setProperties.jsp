<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/3/2023
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Set Properties JSP</title>
</head>
<body>
<jsp:useBean id="user" class="model.User" scope="application"></jsp:useBean>

<jsp:setProperty name="user" property="firstName" value="NewPerson"></jsp:setProperty>
<jsp:setProperty name="user" property="lastName" value="Nguyen"></jsp:setProperty>
<jsp:setProperty name="user" property="userName" value="hi"></jsp:setProperty>
<jsp:setProperty name="user" property="password" value="123"></jsp:setProperty>

</body>
</html>
