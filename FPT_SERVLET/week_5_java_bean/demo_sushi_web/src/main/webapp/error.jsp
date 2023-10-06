<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/5/2023
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Error Page</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <link href="css/container.css" rel="stylesheet" type="text/css"/>
    <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    <link href="css/header.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="wrap">
    <%@include file="includes/header.jsp" %>
    <div class="content">
        <div class="main-content">
            <div class="content-left">
                <h3>Error !!! Please click <a
                        href="/HomeController">here</a> to go back home page.</h3>
            </div>
            <%@include file="includes/container.jsp" %>
        </div>
        <div class="footer">
            <a href="#">Created with SimpleSite</a>
            <span>0 2 5 5 5 3</span>
        </div>
    </div>

</div>

</body>
</html>
