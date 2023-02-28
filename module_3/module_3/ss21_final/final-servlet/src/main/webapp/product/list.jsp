<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/24/2023
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<center>
    <h1 class="text-uppercase text-light bg-success p3">List</h1>
</center>

<h3>
    <a href="product?action=product">Back To List</a>
</h3>
<h4>
    <a href="/product?action=create">Add a new product</a>
</h4>

<form action="/product" method="get" class="form-inline">
    <input type="hidden" name="action" value="searchFloor">
    <div class="form-group mr-3">
        <input type="text" class="form-control" name="searchFloor" placeholder="search floor">
    </div>
    <button type="submit" class="btn btn-primary">Search Floor</button>
</form>

<br>

<form action="/product" method="get" class="form-inline">
    <input type="hidden" name="action" value="search">
    <div class="form-group mr-3">
        <input type="text" class="form-control" name="search" placeholder="search room type">
    </div>
    <button type="submit" class="btn btn-primary">Search Room Type</button>
</form>

<br>

<form action="/product" method="get" class="form-inline">
    <input type="hidden" name="action" value="search">
    <div class="form-group mr-3">
        <input type="text" class="form-control" name="search" placeholder="search price rent">
    </div>
    <button type="submit" class="btn btn-primary">Search Price Rent</button>
</form>

<div align="center">
    <h2>List Product</h2>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Area</th>
            <th>Status</th>
            <th>Floor</th>
            <th>RoomType</th>
            <th>Detail</th>
            <th>Price Rent</th>
            <th>Date Begin</th>
            <th>Date End</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="product" items="${listProduct}">
            <tr>
                <td>${product.id}</td>
                <td>${product.area}</td>
                <td>${product.status}</td>
                <td>${product.floor}</td>
                <td>${product.roomType}</td>
                <td>${product.detail}</td>
                <td>${product.priceRent}</td>
                <td>${product.dateBegin}</td>
                <td>${product.dateEnd}</td>
                <td>
                    <button class="btn btn-danger" type="button" data-toggle="modal" data-target="#exampleModal${product.id}">Delete</button>
                </td>
            </tr>

            <%--Modal Delete--%>
            <div class="modal fade" id="exampleModal${product.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                <a href="/product?action=delete&id=${product.id}">
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
</body>
</html>
