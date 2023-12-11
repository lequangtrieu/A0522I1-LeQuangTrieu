<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/14/2023
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="d" uri="/WEB-INF/tlds/displaydate.tld" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center">List Student</h1>


<h2>
    <p>The current date is <d:currentDate/> </p>
    <d:ifWeekday >
        <p>Live support available at 1-800-555-2222</p>
    </d:ifWeekday>
</h2>


<%--<h1>${listStudent.get(0)}</h1>--%>
<%--<h1>${requestScope.listStudent.get(0)}</h1>--%>


<%--<form action="/student" method="get" class="form-inline">--%>
<%--    <input type="hidden" name="action" value="searchByName">--%>
<%--    <div class="form-group mr-3">--%>
<%--        <input type="text" class="form-control" name="nameSearch1" placeholder="search by name">--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary">Search</button>--%>
<%--</form>--%>

<form action="/student" method="get" class="form-inline">
    <input type="hidden" name="action" value="searchAllField">
    <div class="form-group mr-3">
        <input type="text" class="form-control mr-3" name="nameSearch" placeholder="search by name">
        <input type="text" class="form-control mr-3" name="genderSearch" placeholder="search by gender">
        <input type="text" class="form-control mr-3" name="minId" placeholder="min Id">
        <input type="text" class="form-control mr-3" name="maxId" placeholder="max Id">
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>


<a href="/student?action=create" class="btn btn-primary">Add new student</a>

<table class="table">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Gender</th>
        <th>DOB</th>
        <th>Action</th>
    </tr>

    <c:forEach var="student" items="${listStudent}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.dob}</td>
            <td>
                <a class="btn btn-success" href="/student?action=update&id=${student.id}">Update</a>
                <button class="btn btn-danger" type="button"  data-toggle="modal" data-target="#exampleModal${student.id}"> Delete</button>
            </td>
        </tr>
        <%--Modal Delete--%>
        <div class="modal fade" id="exampleModal${student.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Delete Student</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <p>Bạn có muốn xóa hay khum?</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <form  method="get" id="delete-btn-form">
                            <input type="hidden" name="action" value="delete">
                            <a href="/student?action=delete&id=${student.id}">
                                <button type="button" class="btn btn-primary">Yes</button>
                            </a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</table>

</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
