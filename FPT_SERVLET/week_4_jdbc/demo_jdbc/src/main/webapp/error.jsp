<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/26/2023
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">TRANG WEB ĐANG GẶP SỰ CỐ</h1>
<h2><c:out value="${requestScope.error}"/></h2>
Click here to back <a href="/student">HOME PAGE</a>
</body>
</html>