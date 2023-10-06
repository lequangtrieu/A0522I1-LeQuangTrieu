<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<%@include file="/includes/header.jsp" %>
<%@include file="/includes/column_left_home.jsp" %>
<body>
<h1 style="  text-align: center">Check Triangle</h1>

<form action="/triangle" method="post">
    <table>
        <tr>
            <th>Nhập cạnh a: </th>
            <td><input type="number" name="a"></td>
        </tr>
        <tr>
            <th>Nhập cạnh b: </th>
            <td><input type="number" name="b"></td>
        </tr>
        <tr>
            <th>Nhập cạnh c: </th>
            <td><input type="number" name="c"></td>
        </tr>
        <tr>
            <td><input type="reset"></td>
            <td><input type="submit"></td>
        </tr>
    </table>
</form>

<%@include file="/includes/column_right_news.jsp" %>
<%@include file="/includes/footer.jsp" %>