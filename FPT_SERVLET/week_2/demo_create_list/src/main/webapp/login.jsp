<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/10/2023
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h1>Login Page</h1>

<div class="container">
    <div class="row">
        <div class="offset-3 col-6">
            <form action="LoginServlet" method="post">
                <div class="card">
                    <div class="card-header"><h2>Login to system</h2></div>
                    <div class="card-body">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" name="username" id="username">
                        </div>

                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="text" class="form-control" name="password" id="password">
                        </div>

                        <div>
                            <input type="checkbox" name="remember" id="remember">
                        </div>

                        <div>
                            <input type="submit" value="submit">
                        </div>
                    </div>
                    <div class="card-footer"></div>


                </div>

            </form>
        </div>
    </div>
</div>



</body>
</html>
