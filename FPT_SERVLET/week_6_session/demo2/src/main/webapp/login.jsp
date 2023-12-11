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
    <h2>Login : ITPHUTRAN.COM</h2>
    <%
        if(request.getParameter("error") != null){
            out.print("<p style='color:red'>Sai tên đăng nhập hoặc mật khẩu </p>");
        }
    %>
    <form action="<%=request.getContextPath() %>/login" method="post" >
        <div>
            <label>Username: </label>
            <input type="text" name="username" value="" />
        </div>
        <br />
        <div>
            <label>Password: </label>
            <input type="password" name="password" value="" />
        </div>
        <br />
        <div>
            <input type="submit" name="submit" value="Login" />
            <input type="reset" name="reset" value="Reset" />
        </div>
    </form>
</div>
</body>
</html>