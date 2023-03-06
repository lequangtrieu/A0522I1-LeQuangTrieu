<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/4/2022
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <style>
    .header-banner {
      background-color: #333;
      background-image: url('https://37.media.tumblr.com/8b4969985e84b2aa1ac8d3449475f1af/tumblr_n3iftvUesn1snvqtdo1_1280.jpg');
      background-position: center;
      background-repeat: no-repeat;
      background-size: cover;
      width: 100%;
      height: 200px;
    }
  </style>
  <link rel="stylesheet" href="product/Layout.css">
  <link rel="stylesheet" href="product/bootstrap.css">
</head>
<body>
<div id="header">
  <div class="header-banner">
    <h1>LIST</h1>
  </div>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="MainServlet">Home</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Employee
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="MainServlet?action=list">List</a></li>
              <li><a class="dropdown-item" href="MainServlet?action=create">Create</a></li>
              <li><a class="dropdown-item" href="#">Update</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Delete</a></li>
            </ul>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Customer
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">List</a></li>
              <li><a class="dropdown-item" href="#">Create</a></li>
              <li><a class="dropdown-item" href="#">Update</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Delete</a></li>
            </ul>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Service
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">List</a></li>
              <li><a class="dropdown-item" href="#">Create</a></li>
              <li><a class="dropdown-item" href="#">Update</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Delete</a></li>
            </ul>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Contract
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">List</a></li>
              <li><a class="dropdown-item" href="#">Create</a></li>
              <li><a class="dropdown-item" href="#">Update</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Delete</a></li>
            </ul>
          </li>

        </ul>
        <form class="d-flex" action="/MainServlet" method="post">
          <input name="searchInput" id="search" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <input type="hidden" name="action" value="search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
</div>
<div id="sidebar">

</div>
<div id="main">
  <h2>List</h2>
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
<div id="footer">

</div>
<script type="text/javascript" src="product/bootstrap.js"></script>
</body>
</html>

