<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Of Group</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Group Name</th>
        <th>Description</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="group" items="${requestScope.groupList}">
        <tr>
            <td>${group.id}</td>
            <td>${group.groupName}</td>
            <td>${group.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/ContactController?action=createGroupList">Add Group</a>
<a href="/ContactController">Contact List</a>

</body>
</html>
