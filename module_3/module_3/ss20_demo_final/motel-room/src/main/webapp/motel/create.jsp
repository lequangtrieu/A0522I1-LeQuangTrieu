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
    <title>Add New Rent Motel</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<center>
    <h1>Add New Rent Motel</h1>
    <h2>
        <a href="motel?action=motel">Back To Motel List</a>
    </h2>
    <br>
</center>

<div>
    <form action="/motel" method="post">
        <input type="hidden" name="action" value="create">
        <table>

                <h2>Add New Motel</h2>

            <tr>
                <th>Name:</th>
                <td><input type="text" name="name" id="name" size="45" pattern="(^[A-Za-z]{2,16})([ ]{0,1})([A-Za-z]{2,16})?([ ]{0,1})?([A-Za-z]{2,16})?([ ]{0,1})?([A-Za-z]{2,16})" title="please enter your name" required/></td>
            </tr>

            <tr>
                <th>Phone Number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" size="45" pattern="(\+84|0)\d{9,10}" title="Vui lòng nhập đúng +84 hoặc 0xxx" required/>
                </td>
            </tr>

            <tr>
                <th>Date Begin:</th>
                <td>
                    <input type="date" name="dateBegin" id="dateBegin" size="15"/>
                </td>
            </tr>

            <tr>
                <th>Note:</th>
                <td>
                    <input type="text" name="note" id="note" size="15"/>
                </td>
            </tr>

            <tr>
                <th>Id Payment:</th>
                <td>
                    <select name="idPayment" id="idPayment">
                        <option value="100">- Payment Type -</option>
                        <c:forEach var="payment" items="${paymentList}">
                            <option value="${payment.id}" ${payment.id == motel.idPayment ? "selected" : ""}>${payment.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="Save">
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
