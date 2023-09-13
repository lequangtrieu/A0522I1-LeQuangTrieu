<%-- 
    Document   : list
    Created on : 12-09-2023, 14:24:15
    Author     : datqu
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="model.StudentList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section id="main-contain">
            <h1>Student List</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>DOB</th>
                    </tr>
                </thead>
                <tbody>
<%
        StudentList studentService = new StudentList();
        List<Student> studentList = studentService.getList();
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
        </section>
    </body>
</html>
