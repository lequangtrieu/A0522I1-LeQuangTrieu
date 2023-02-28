<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 06/02/2023
  Time: 7:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center text-light bg-success p-3 text-uppercase">Product Discount</h1>
<form action="/discount" method="post">
  <label for="product">Product Description: </label><br>
  <input type="text" name="product" placeholder="enter the name of product" id="product" class="form-control"> <br>
  <label for="price">List Price: </label><br>
  <input type="text" name="price" placeholder="enter the price oof the product" id="price" class="form-control"><br>
  <label for="percent">Discount Percent (%): </label><br>
  <input type="text" name="percent" placeholder="enter the percent of discount" id="percent" class="form-control"><br>
  <input type="submit" value="Submit" class="btn btn-success">
</form>
</body>
<h2 style="text-align: center"></h2>
</html>
