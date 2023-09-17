<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/14/2023
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%
    String studentId = request.getParameter("id");
    System.out.println(studentId);
%>
<h1 class="text-center">Create Student</h1>
<a href="/student" class="btn btn-primary">Back to list student</a>
<form action="/student" method="POST">
<%--    <input type="hidden" name="action" value="create">  &lt;%&ndash; truy cập action create trong controller &ndash;%&gt;--%>


    <input type="hidden" name="action" value="<%= (studentId == null) ? "create" : "update" %>">

    <table class="table">
        <tr>
            <td> Id:</td>
            <td><input type="text" name="id" size="50" class="form-control"  value="<c:out value='${student.id}' />"/></td>
        </tr>
        <tr>
            <td> Name:</td>
            <td><input type="text" name="name" size="50" class="form-control" value="<c:out value='${student.name}'/>"/></td>
        </tr>

        <tr>
            <td> Gender:</td>
            <td>
                <c:if test="${student.gender == 'F'}">
                    <input type="radio" name="gender" value="M" /> Male
                    <input type="radio" name="gender" value="F" checked/> Female
                </c:if>

                <c:if test="${student.gender != 'F'}">
                    <input type="radio" name="gender" value="M" checked/> Male
                    <input type="radio" name="gender" value="F" /> Female
                </c:if>
            </td>
<%--            <td><select name="gender">--%>
<%--                <option>Male</option>--%>
<%--                <option>Female</option>--%>
<%--            </select></td>--%>
        </tr>
        <tr>
            <td> Date of Birth:</td>
            <td><input type="text" name="dob" placeholder="MM/DD/YYYY" size="15" class="form-control" value="<c:out value='${student.dob}'/>"/></td>
        </tr>
    </table>
    <input type="reset" value="Clear" name="bntClear" class="btn btn-success"/>
    <input type="submit" value="Submit" name="btnSubmit" class="btn btn-primary"/>
</form>

</body>
</html>
