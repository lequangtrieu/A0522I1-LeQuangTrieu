<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 07/02/2023
  Time: 1:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h3 class="text-center text-light p-3 bg-success text-uppercase">Dictionary</h3>
<form action="translate.jsp" method="post">
    <label for="word">Enter the word you wanna translate: </label>
    <input class="form-control" type="text" id="word" placeholder="enter a word" name="word"> <br>
    <input type="submit" name="submit" value="Search" class="btn btn-primary">
</form>
</body>
</html>
