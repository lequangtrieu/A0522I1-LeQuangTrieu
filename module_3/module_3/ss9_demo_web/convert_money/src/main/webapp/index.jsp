<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 06/02/2023
  Time: 5:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2 class="text-center text-light bg-success p-3">Currency Convert</h2>
<form action="/convert" method="post">
    <label for="rate">RATE: </label>
    <input class="form-control" type="text" name="rate" placeholder="RATE" id="rate" value="22000"/><br>
    <lable for="usd">USD: </lable>
    <input class="form-control" type="text" name="usd" placeholder="USD" value="0" id="usd"/><br>
    <input class="btn btn-primary" type="submit" id="submit" value="Converter"/>
</form>


</body>
</html>
