<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

</head>
<body>

<div class="container">
    <h3>Showing the information <br></h3>
    <hr>
    <h5>Welcome, ${ param.name } <br>
        Value is ${ sessionScope.user } <br>
        Hello, ${cookie.name.value}
    </h5>
    <a href="../index.html">Back</a>
</div>

</body>
</html>
