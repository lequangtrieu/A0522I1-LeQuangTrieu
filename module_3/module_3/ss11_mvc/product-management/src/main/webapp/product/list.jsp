<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center text-light text-uppercase bg-success p-3">Product List</h1>
<h3>
    <a href="/products?action=create"> Create a new product</a>
</h3>

<table class="table table-dark table-striped">
    <tr>
        <th>Id</th>
        <td>Name</td>
        <td>Price</td>
        <td>Info Product</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>Search</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getInfoProduct()}</td>
            <td>${product.getManufacturer()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
            <td><a href="/products?action=search&id=${product.getId()}">Search</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
