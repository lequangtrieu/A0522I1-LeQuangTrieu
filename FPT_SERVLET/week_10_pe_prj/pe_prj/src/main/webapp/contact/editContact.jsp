<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Contact</title>
</head>
<body>
<h1>Edit a Contact</h1>

<form action="/ContactController" method="post">
  <input type="hidden" name="action" value="updateContact">
  <table>
    <tr>
      <th>Id</th>
      <td><input type="text" name="id" readonly value="<c:out value='${contact.id}'/>"></td>
    </tr>
    <tr>
      <th>First Name:</th>
      <td><input type="text" name="firstName" required value="<c:out value='${contact.firstName}'/>"></td>
    </tr>
    <tr>
      <th>Last Name:</th>
      <td><input type="text" name="lastName" required value="<c:out value='${contact.lastName}'/>"></td>
    </tr>
    <tr>
      <th>Group:</th>
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
      <td><input type="text" name="phoneNumber" value="<c:out value='${contact.phoneNumber}'/>"
                 pattern="(\+84|0)\d{9,10}" title="Vui lòng nhập đúng +84 hoặc 0xxx" required></td>
    </tr>
  </table>
  <input type="submit" value="Edit">
  <a href="/ContactController">Return Contact List</a>
</form>

</body>
</html>
