<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.demo_create_list.service.StudentService" %>
<%@ page import="com.example.demo_create_list.service.StudentServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo_create_list.model.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Student</title>
    <link rel="stylesheet" href="/static/css/main.css">
    <jsp:include page="/includes/header.jsp"></jsp:include>
    <link rel="stylesheet" href="/static/footer_bst/bootstrap.min.css">
    <link rel="stylesheet" href="/static/footer_bst/style.css">
</head>
<body>



<section class="content">
    <div class="container-fluid">
        <!-- Vertical Layout -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="header">
                        <h2>
                            List Student
                        </h2>
                    </div>
                    <div class="body table-responsive">
                        <a href="/student/create.jsp" class="btn btn-primary btn-custom">
                            <i class="fa fa-plus-circle" aria-hidden="true"></i> Add new student
                        </a>
                        <table class="table">
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

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="/includes/sidebar.jsp"></jsp:include>
<div class="row">
    <div class="col-lg-2">
        <jsp:include page="/includes/navbar.jsp"></jsp:include>
    </div>
    <div class="col-lg-10">
        <jsp:include page="/includes/footer.jsp"></jsp:include>
    </div>
</div>

<jsp:include page="/includes/script.jsp"></jsp:include>
</body>
</html>