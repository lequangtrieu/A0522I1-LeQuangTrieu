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
<jsp:include page="../../../includes/import-head.jsp"/>
<body>
<jsp:include page="../../../includes/pre-loader.jsp"/>
<jsp:include page="../../../includes/canvas-menu.jsp"/>
<jsp:include page="../../../includes/header.jsp"/>

<div class="container mt-4 mb-4">
    <h1 class="text-center">ROOMS</h1>

    <div class="row mt-3">
        <c:forEach var="service" items="${serviceList}">
            <div class="col-md-4 mb-4">
                <div class="card">
                    <img src="${service.serviceImg}" class="card-img-top" alt="image">
                    <div class="card-body">
                        <h5 class="card-title"><c:out value="${service.serviceName}" /></h5>
                        <p class="card-text">Area: <c:out value="${service.serviceArea}" /></p>
                        <p class="card-text">Cost: <c:out value="${service.serviceCost}" /></p>
                        <!-- Add other service attributes here -->
                        <a href="/service?action=showUpdateService&id=${service.serviceId}" class="btn btn-success btn-sm">Book Room</a>
                        <a href="/service?action=viewServiceDetail&id=${service.serviceId}" class="btn btn-primary btn-sm">View Room Detail</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>


<jsp:include page="../../../includes/footer.jsp"/>
<jsp:include page="../../../includes/import-script.jsp"/>
</body>
</html>
