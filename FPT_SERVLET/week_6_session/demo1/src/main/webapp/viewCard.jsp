<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Show</title>
</head>
<body>


<h1>Your Shopping Cart</h1>
<a href="/CartController"> Add more</a>


<form action="CartController" method="POST">


    <%--    <c:set var="shop" value="${sessionScope.SHOP}"/>--%>


    <table width="75%" border="1">
        <thead>

        <tr>
            <th>No.</th>
            <th>Title</th>
            <th>Quantity</th>
            <th>Action</th>
        </tr>

        </thead>

        <tbody>
        <c:forEach var="rows" items="${cardDTO}" varStatus="status">
            <tr>
                <td> ${status.count} </td>
                <td>${rows.key.name}</td>
                <td>${rows.value}</td>
                <td><input type="checkbox" name="rmv" value="${rows.key.id}"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
        <input type="submit" value="Remove" name="action">

</form>
</body>
</html>
