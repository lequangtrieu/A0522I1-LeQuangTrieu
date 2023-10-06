<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/29/2023
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center bg-success p-3 text-light">CREATE</h1>

<%
    Integer hitsCount = (Integer) application.getAttribute("hitCounter");
    if (hitsCount == null || hitsCount == 0) {
        /* First visit */
        out.print("Welcome to my website! ");
        hitsCount = 1;
    } else {
        /* return visit */
        out.print("Welcome back to my website! ");
        hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
    out.println("Total number of visits: " + hitsCount);
%>
<br>
<a href="/index.jsp" class="btn btn-primary">Back to list</a>

<form action="/magazine" method="POST">
    <table class="table">
        <tr>
            <td> Id:</td>
            <td><input type="text" name="id" size="50" pattern="(^M[0-9]{3})" title="Maz must follow M + 3 digits" required/></td>
        </tr>
        <tr>
            <td> Title:</td>
            <td><input type="text" name="title" size="50" required/></td>
        </tr>
        <tr>
            <td> Publisher:</td>
            <td><input type="text" name="publisher" size="50" required/></td>
        </tr>
        <tr>
            <td> Price:</td>
            <td><input type="number" name="price" size="50" required/></td>
        </tr>
    </table>
    <input type="reset" value="Clear" name="bntClear" class="btn btn-success" />
    <input type="submit" value="Submit" name="btnSubmit"  class="btn btn-primary" />
</form>

</body>
</html>
