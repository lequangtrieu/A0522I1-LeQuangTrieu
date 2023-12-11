<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/5/2023
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../includes/import-head.jsp"/>
<body>
<jsp:include page="../../includes/pre-loader.jsp"/>
<jsp:include page="../../includes/canvas-menu.jsp"/>
<jsp:include page="../../includes/header.jsp"/>

<div class="container mt-4 mb-4">
    <h1 style="text-align: center">LIST CUSTOMER</h1>
    <a class="btn btn-primary" href="/customer?action=createCustomer">Add new Customer</a>
    <table class="table table-striped table-bordered mt-3">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.customerId}" /></td>
                <td><c:out value="${customer.name}" /></td>
                <td><c:out value="${customer.birthday}" /></td>
                <td>
                    <c:choose>
                        <c:when test="${customer.gender == true}">
                            Nam
                        </c:when>
                        <c:otherwise>
                            Nữ
                        </c:otherwise>
                    </c:choose>
                </td>
                <td><a href="viewCustomer.jsp?id=<c:out value="${customer.customerId}" />" class="btn btn-primary btn-sm">View Detail</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
