<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add a Group</h1>

<form action="/ContactController" method="post">
    <input type="hidden" name="action" value="addGroupList">
    <table>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description"></td>
        </tr>
    </table>
    <input type="submit" value="Add">
    <a href="/ContactController?action=listGroup">Return To Group List</a>
</form>

</body>
</html>
