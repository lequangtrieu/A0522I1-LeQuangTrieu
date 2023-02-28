<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 04/02/2023
  Time: 10:42 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WEB LOGIN SERVLET</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form action="/login" method="post">
    <div class="login">
        <h2 class="text-center bg-success text-danger text-uppercase p-3">Login</h2>
        <input class="form-label form-control" type="text" name="username" size="30"  placeholder="username" /> <br>
        <input class="form-label form-control" type="password" name="password" size="30" placeholder="password" /> <br>
        <input class="btn btn-primary" type="submit" value="Sign in"/>
    </div>
</form>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>
