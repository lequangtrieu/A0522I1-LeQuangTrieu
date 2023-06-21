<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/24/2023
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/customer/create"><h2>Create</h2></a>
  <h1>List Customer</h1>
  <table border="1">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
    </tr>
    <c:forEach items="${customers}" var="cus">
      <tr>
        <td>${cus.id}</td>
        <td>${cus.name}</td>
        <td>${cus.email}</td>
        <td>${cus.address}</td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
