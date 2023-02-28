<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/21/2023
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Motel</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<center>
    <h1>Motel Management</h1>
</center>

<h4>
    <a href="/motel?action=create">Add a new motel</a>
</h4>

<form action="/motel" method="get" class="form-inline">
    <input type="hidden" name="action" value="search">
    <div class="form-group mr-3">
        <input type="text" class="form-control" name="search" placeholder="search">
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>

<h4>
    <a href="/motel?action=sort">Sort Motel</a>
</h4>

<div align="center">
    <h2>List Motel</h2>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone Number</th>
            <th>Date Begin</th>
            <th>Note</th>
            <th>Id Payment</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="motel" items="${listMotel}">
            <tr>
                <td>${motel.id}</td>
                <td>${motel.name}</td>
                <td>${motel.phoneNumber}</td>
                <td>${motel.dateBegin}</td>
                <td>${motel.note}</td>
                <td>${motel.idPayment}</td>
                <td>
                    <a class="btn btn-primary" href="/motel?action=update&id=${motel.id}">Edit</a>
<%--                    <button type="button"><a href="/motel?action=update&id=${motel.id}">Edit</a></button>--%>
<%--                    <a href="#" type="button">Delete</a>--%>
                    <button class="btn btn-danger" type="button"  data-toggle="modal" data-target="#exampleModal${motel.id}"> Delete</button>
                </td>
            </tr>
            <%--Modal Delete--%>
            <div class="modal fade" id="exampleModal${motel.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Delete Motel</h5>
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
                                <a href="/motel?action=delete&id=${motel.id}">
                                <button type="button" class="btn btn-primary">Yes</button>
                                </a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        </tbody>
    </table>
</div>



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        $('#page').dataTable({
            'searching': false,
            'pageLength': 6
        })
    })
    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget);
        var id = button.data('id') ;
        var modal = $(this);
        var addInput = '<input type="hidden" name="id" value="' + id + '"/>'
        modal.find('#delete-btn-form').prepend(addInput);
    })
</script>
</body>
</html>


