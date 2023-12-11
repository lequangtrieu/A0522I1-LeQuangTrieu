<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>JSP Expression Language Demo- output</h3>
<hr>
<h2>Using the Employee Bean</h2>
<br/>
<!-- Using the hourly bean -->
Employee ID:${sessionScope.EMPLOYEE.employeeID} <br/>
Employee Name: ${sessionScope.EMPLOYEE.lastName}<br/>
Hourly Rate: ${sessionScope.EMPLOYEE.hourlyRate}<br/>

<hr/>
<h2>Using the Map to show the information</h2>
Table of tax rates:
<table border="1">
    <thead>
    <tr>
        <th>Name</th>

        <th>Tax</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="entry" items="${sessionScope.TAXRATES}">
    <tr>
        <td>${entry.key}</td>
        <td>${entry.value}</td>
    </tr>
    </tbody>
    </c:forEach>
</table>

</body>
</html>
