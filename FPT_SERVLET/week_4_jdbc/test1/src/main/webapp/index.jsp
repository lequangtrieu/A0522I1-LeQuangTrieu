<%@ page import="model.MagazinesDAO" %>
<%@ page import="model.Magazine" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center bg-success p-3 text-light">LIST</h1>

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

<a href="/create.jsp" class="btn btn-primary">Add new magazine</a>

<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Publisher</th>
        <th>Price</th>
    </tr>
    </thead>

    <tbody>
    <%
        MagazinesDAO magazinesDAO = new MagazinesDAO();
        List<Magazine> list = magazinesDAO.getAllList();
        for (Magazine st : list) {
    %>
    <tr>
        <td><%= st.getId() %>
        </td>
        <td><%= st.getTitle() %>
        </td>
        <td><%= st.getPublisher() %>
        </td>
        <td><%= st.getPrice() %>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>