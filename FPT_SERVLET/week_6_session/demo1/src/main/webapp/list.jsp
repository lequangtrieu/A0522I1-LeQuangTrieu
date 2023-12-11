<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<h1>MVC Shopping Cart Demo</h1>
<a href="/viewCard.jsp">View Cart</a>
    Please, choose your favourite book:<br>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td><a href="/AddCartController?id=${product.id}">Add</a></td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>