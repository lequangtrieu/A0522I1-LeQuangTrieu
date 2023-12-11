<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/17/2023
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="validation.jsp" method="post">
  <table>
    <tr>
      <td>Enter User - Id:</td>
      <td><input type="text" size="30px" name="uid"> </td>
    </tr>
    <tr>
      <td>Enter Passord:</td>
      <td><input type="password" size="30px" name="upass"> </td>
    </tr>
    <tr>
      <td colspan="2" align="right">
        <input type="submit" value="Submit">
      </td>
    </tr>
  </table>
</form>

</body>
</html>
