<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<%
    session.setAttribute("user", "admin");
    Cookie ck = new Cookie("name", "TranLQ");
    response.addCookie(ck);
%>
<div class="container">
    <h3>Home Page</h3>

    <hr>
    <form action="process.jsp">
        Enter Name:<input type="text" name="name"/><br/><br/>
        <input type="submit" value="go"/>
    </form>
    <a href="../index.html">Back</a>
</div>

</body>
</html>
