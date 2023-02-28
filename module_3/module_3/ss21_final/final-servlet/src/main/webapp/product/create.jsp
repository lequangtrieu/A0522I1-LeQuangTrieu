<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/24/2023
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Create</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<center>
    <h1 class="text-uppercase text-light bg-success p3">Add New Product</h1>
    <h2>
        <a href="product?action=motel">Back To List</a>
    </h2>
    <br>
</center>

<div align="center">
    <form action="/product" method="post">
        <input type="hidden" name="action" value="create">

        <table cellpadding="5" border="1">
            <h2>Add new Product</h2>

            <tr>
                <th>id: </th>
                <td><input type="text" name="id" id="id" size="45"></td>
            </tr>

            <tr>
                <th>area: </th>
                <td><input type="text" name="area" id="area" size="45"></td>
            </tr>

            <tr>
                <th>status: </th>
                <td><input type="text" name="status" id="status" size="45"></td>
            </tr>

            <tr>
                <th>floor: </th>
                <td><input type="text" name="floor" id="floor" size="45"></td>
            </tr>

            <tr>
                <th>roomType: </th>
                <td><input type="text" name="roomType" id="roomType" size="45"></td>
            </tr>

            <tr>
                <th>detail: </th>
                <td><input type="text" name="detail" id="detail" size="45"></td>
            </tr>

            <tr>
                <th>priceRent: </th>
                <td><input type="text" name="priceRent" id="priceRent" size="45"></td>
            </tr>

            <tr>
                <th>dateBegin: </th>
                <td><input type="date" name="dateBegin" id="dateBegin" size="45"></td>
            </tr>

            <tr>
                <th>dateEnd: </th>
                <td><input type="date" name="dateEnd" id="dateEnd" size="45"></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="Save">
<%--                    <button type="button" value="Save" class="btn btn primary"></button>--%>
                </td>
            </tr>
        </table>
    </form>
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
