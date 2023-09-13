<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.demo_create_list.service.StudentService" %>
<%@ page import="com.example.demo_create_list.service.StudentServiceImpl" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo_create_list.model.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="/student/create.jsp">Add new student</a>
<br>


<%--<table border="1">--%>
<%--    <thead>--%>
<%--        <tr>--%>
<%--            <th>Id</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Gender</th>--%>
<%--            <th>DOB</th>--%>
<%--        </tr>--%>
<%--    </thead>--%>

<%--    <tbody>--%>
<%--        <c:forEach var="student" items="${students}">--%>
<%--        <tr>--%>
<%--            <td>${student.id}</td>--%>
<%--            <td>${student.name}</td>--%>
<%--            <td>${student.gender}</td>--%>
<%--            <td>${student.dob}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>

<table border="1">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Gender</th>
        <th>DOB</th>
    </tr>
    </thead>

    <tbody>
    <%
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.getAllList();
        for (Student st : studentList) {
    %>
    <tr>
        <td><%= st.getId() %></td>
        <td><%= st.getName() %></td>
        <td><%= st.getGender() %></td>
        <td><%= st.getDob() %></td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>