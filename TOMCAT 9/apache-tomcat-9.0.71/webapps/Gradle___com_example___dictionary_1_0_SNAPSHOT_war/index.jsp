<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 06/02/2023
  Time: 6:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1 class="text-center text-light p-3 bg-success text-uppercase">Dictionary</h1>
<form action="/translate" method="post">
  <label for="word">Enter the word you wanna translate: </label>
  <input class="form-control" type="text" id="word" placeholder="enter a word" size="3" name="word"> <br>
  <input type="submit" name="submit" class="btn btn-success">
</form>


</body>
</html>
