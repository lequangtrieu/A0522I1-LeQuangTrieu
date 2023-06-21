<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/24/2023
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create customer</h1>

<form:form action="/customer/create" method="post" modelAttribute="customer">
    <table border="1">
        <tr>
            <th>Id</th>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"></td>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
