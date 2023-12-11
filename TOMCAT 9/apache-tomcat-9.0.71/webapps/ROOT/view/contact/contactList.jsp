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
    <h1 class="text-center">Contact List</h1>
    <a class="btn btn-primary" href="/contact?action=createContact">Add new Contact</a>
    <table class="table table-striped table-bordered mt-3">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Deposit</th>
            <th>Total Money</th>
            <th>Employee ID</th>
            <th>Customer ID</th>
            <th>Service ID</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="contact" items="${contactList}">
            <tr>
                <td><c:out value="${contact.contactId}" /></td>
                <td><c:out value="${contact.startDate}" /></td>
                <td><c:out value="${contact.endDate}" /></td>
                <td><c:out value="${contact.deposit}" /></td>
                <td><c:out value="${contact.totalMoney}" /></td>
                <td><c:out value="${contact.employeeId}" /></td>
                <td><c:out value="${contact.customerId}" /></td>
                <td><c:out value="${contact.serviceId}" /></td>
                <td><a href="viewContact.jsp?id=<c:out value="${contact.contactId}" />" class="btn btn-primary btn-sm">View Detail</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
