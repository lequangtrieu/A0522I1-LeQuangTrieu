<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/12/2023
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello everybody</h1>

<form:form method="post" action="/demo/result">
    <table>
        <tr>
            <th>USD: </th>
            <td><input type="number" name="usd"></td>
        </tr>
        <tr>
            <th>Rate:</th>
            <td><input type="number" name="rate"></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"></td>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
