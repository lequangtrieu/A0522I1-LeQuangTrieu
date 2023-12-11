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

<%
    String serviceId = request.getParameter("id");
    System.out.println(serviceId);
%>

<div class="container mt-5 border border-dark border-3 rounded p-4">
    <h2 class="text-center font-weight-bold">Create New Service</h2>
    <form action="/service" method="post">
        <input type="hidden" name="action" value="<%= (serviceId == null) ? "createService" : "updateService" %>">

        <c:if test="${service != null}">
            <input class="form-control" readonly type="text" name="id" value="<c:out value='${service.serviceId}'/>"/>
        </c:if>

        <div class="form-group">
            <label for="serviceName">Service Name:</label>
            <input type="text" class="form-control" id="serviceName" name="service_name" required value="<c:out value='${service.serviceName}'/>">
        </div>
        <div class="form-group">
            <label for="serviceArea">Service Area:</label>
            <input type="number" class="form-control" id="serviceArea" name="service_area" required value="<c:out value='${service.serviceArea}'/>">
        </div>
        <div class="form-group">
            <label for="serviceCost">Service Cost:</label>
            <input type="number" step="0.01" class="form-control" id="serviceCost" name="service_cost" required value="<c:out value='${service.serviceCost}'/>">
        </div>
        <div class="form-group">
            <label for="serviceMaxPeople">Max People:</label>
            <input type="number" class="form-control" id="serviceMaxPeople" name="service_max_people" required value="<c:out value='${service.serviceMaxPeople}'/>">
        </div>
        <div class="form-group">
            <label for="standardRoom">Standard Room:</label>
            <input type="text" class="form-control" id="standardRoom" name="standard_room" value="<c:out value='${service.standardRoom}'/>">
        </div>
        <div class="form-group">
            <label for="otherConvenience">Other Convenience:</label>
            <input type="text" class="form-control" id="otherConvenience" name="description_other_convenience" value="<c:out value='${service.descriptionOtherConvenience}'/>">
        </div>
        <div class="form-group">
            <label for="poolArea">Pool Area:</label>
            <input type="number" step="0.01" class="form-control" id="poolArea" name="pool_area" value="<c:out value='${service.poolArea}'/>">
        </div>
        <div class="form-group">
            <label for="numberOfFloors">Number of Floors:</label>
            <input type="number" class="form-control" id="numberOfFloors" name="number_of_floors" value="<c:out value='${service.numberOfFloors}'/>">
        </div>
        <div class="form-group">
            <label for="serviceTypeID">Service Type ID:</label> <br>
            <select name="serviceTypeID" id="serviceTypeID">
                <c:forEach var="serviceType" items="${requestScope.serviceTypeList}">
                    <option value="${serviceType.serviceTypeId}" ${serviceType.serviceTypeId == service.serviceTypeId ? "selected" : ""}> ${serviceType.serviceTypeId} - ${serviceType.serviceTypeName} </option>
                </c:forEach>
            </select> <br><br>
        </div>
        <div class="form-group">
            <label for="rentTypeID">Rent Type ID:</label> <br>
            <select name="rentTypeID" id="rentTypeID">
                <c:forEach var="rentType" items="${requestScope.rentTypeList}">
                    <option value="${rentType.rentTypeId}" ${rentType.rentTypeId == service.rentTypeId ? "selected" : ""}> ${rentType.rentTypeId} - ${rentType.rentTypeName} </option>
                </c:forEach>
            </select> <br><br>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-success">Reset</button>
            <a href="/service?action=listService" class="btn btn-secondary">Back to Service List</a>
        </div>
    </form>
</div>

<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
