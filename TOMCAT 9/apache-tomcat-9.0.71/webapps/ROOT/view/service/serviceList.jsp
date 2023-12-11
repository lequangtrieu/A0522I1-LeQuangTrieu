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
    <h1 class="text-center">LIST SERVICE</h1>
    <a class="btn btn-primary" href="/service?action=showCreateService">Add new Service</a>
    <table class="table table-striped table-bordered mt-3">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Area</th>
            <th>Cost</th>
            <!-- Add other column headings here based on Service attributes -->
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="service" items="${serviceList}">
            <tr>
                <td><c:out value="${service.serviceId}" /></td>
                <td><c:out value="${service.serviceName}" /></td>
                <td><c:out value="${service.serviceArea}" /></td>
                <td><c:out value="${service.serviceCost}" /></td>
                <!-- Add other columns here based on Service attributes -->
                <td>
                    <a href="/service?action=showUpdateService&id=${service.serviceId}" class="btn btn-success btn-sm">Update Service</a>
                    <a href="/service?action=viewServiceDetail&id=${service.serviceId}" class="btn btn-primary btn-sm">View Service Detail</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>



<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
