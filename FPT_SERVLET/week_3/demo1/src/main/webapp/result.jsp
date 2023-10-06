<%@ page import="model.Triangle" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/22/2023
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@include file="/includes/header.jsp" %>
<%@include file="/includes/column_left_home.jsp" %>
<body>
<%
    Triangle triangle = (Triangle) request.getAttribute("triangle");

%>

<h1><%=triangle%>
</h1>

<h2>
    <%
        String check = "";
        if (triangle.isTriangle(triangle.getA(), triangle.getB(), triangle.getC())) {
            check = "Đây là tam giác";
        } else {
            check = "Đây không phải là tam giác";
        }
    %>
    <%=check%>
</h2>

<h2>
    <%
        if (triangle.isTriangle(triangle.getA(), triangle.getB(), triangle.getC())) {
    %>
    Chu vi của tam giác: <%= triangle.getPerimeter()%>
    <%
        }
    %>
</h2>
<h2>
    <%
        if (triangle.isTriangle(triangle.getA(), triangle.getB(), triangle.getC())) {
    %>
    Diện tích của tam giác: <%= triangle.getArea()%>
    <%
        }
    %>

</h2>

<%@include file="/includes/column_right_news.jsp" %>
<%@include file="/includes/footer.jsp" %>
