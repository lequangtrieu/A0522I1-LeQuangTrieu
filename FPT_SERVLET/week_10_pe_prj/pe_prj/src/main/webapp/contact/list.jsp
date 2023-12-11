<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>LIST OF CONTACT</h1>
<p>There are <span>${requestScope.sizeContact}</span> contacts in the List</p>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Group</th>
        <th>Phone Number</th>
        <th>Operations</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contact" items="${requestScope.listContact}">
        <tr>
            <td>${contact.id}</td>
            <td>${contact.firstName}</td>
            <td>${contact.lastName}</td>
            <td>${contact.groupId}</td>
            <td>${contact.phoneNumber}</td>
            <td>
                <a class="btn btn-primary" href="/ContactController?action=update&id=${contact.id}">Edit</a>
                <a class="btn btn-danger" href="/ContactController?action=delete&id=${contact.id}">Remove</a>
            </td>
        </tr>
    </c:forEach>
    <a href="/">Add Contact</a> <br>
    <a href="/ContactController?action=listGroup">List Group</a>
    </tbody>
</table>

</body>
</html>
