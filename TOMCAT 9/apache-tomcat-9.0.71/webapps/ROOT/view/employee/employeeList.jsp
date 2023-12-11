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
    <h1 class="text-center">Employee List</h1>
    <a class="btn btn-primary" href="/employee?action=createEmployee">Add new Employee</a>
    <table class="table table-striped table-bordered mt-3">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>ID Card</th>
            <th>Salary</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <!-- Add other column headings here based on Employee attributes -->
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td><c:out value="${employee.employeeId}" /></td>
                <td><c:out value="${employee.employeeName}" /></td>
                <td><c:out value="${employee.employeeBirthday}" /></td>
                <td><c:out value="${employee.employeeIdCard}" /></td>
                <td><c:out value="${employee.employeeSalary}" /></td>
                <td><c:out value="${employee.employeePhone}" /></td>
                <td><c:out value="${employee.employeeEmail}" /></td>
                <td><c:out value="${employee.employeeAddress}" /></td>
                <!-- Add other columns here based on Employee attributes -->
                <td><a href="viewEmployee.jsp?id=<c:out value="${employee.employeeId}" />" class="btn btn-primary btn-sm">View Detail</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
