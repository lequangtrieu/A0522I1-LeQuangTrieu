<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Contact</title>
</head>
<body>
<h1>Add a Contact</h1>
<form action="/ContactController" method="post">
    <input type="hidden" name="action" value="create">
    <table>
        <tr>
            <th>First Name:</th>
            <td><input type="text" name="firstName" required></td>
        </tr>
        <tr>
            <th>Last Name:</th>
            <td><input type="text" name="lastName" required></td>
        </tr>
        <tr>
            <th><label for="groupId">Group:</label></th>
            <td>
                <select name="groupId" id="groupId">
                    <c:forEach var="group" items="${requestScope.groupList}">
                        <option value="${group.id}">${group.groupName} - ${group.description}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <th>Phone Number:</th>
            <td><input type="text" name="phoneNumber" pattern="(\+84|0)\d{9,10}" title="Vui lòng nhập đúng +84 hoặc 0xxx" required></td>
        </tr>
    </table>
    <input type="submit" value="Add">
    <a href="/ContactController">Return Contact List</a>
</form>

</body>
</html>
