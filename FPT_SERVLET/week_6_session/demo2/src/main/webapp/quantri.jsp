<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form Login</title>
</head>
<body>
<div style="width: 500px; margin: 50px auto;background:#D0D01A;padding:30px">
    <h2>Quản lý admin || ITPHUTRAN.COM</h2>
    <%
        if(session.getAttribute("username") != null){
    %>
    <p>Username :<strong><%=session.getAttribute("username") %></strong> </p>
    <%} %>
</div>
</body>
</html>