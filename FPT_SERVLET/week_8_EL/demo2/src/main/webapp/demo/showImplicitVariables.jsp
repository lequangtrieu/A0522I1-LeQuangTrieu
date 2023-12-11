<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    application.setAttribute("appAttribute", "foo");
    pageContext.setAttribute("pageAttribute", "bar");
    session.setAttribute("sessionAttribute", "sand");
    request.setAttribute("requestAttribute", "castle");
%>
<body>

<h4>Show the implicit variable</h4>
<hr>
Remote Address: ${pageContext.request.remoteAddr}<br/>
Request URL: ${pageContext.request.requestURL}<br/>

Session ID: ${pageContext.request.session.id}<br/>
Application Scope: ${applicationScope["appAttribute"]}<br/>
Page Scope: ${pageScope["pageAttribute"]}<br/>
Session Scope: ${sessionScope["sessionAttribute"]}<br/>
Request Scope: ${requestScope["requestAttribute"]}<br/>
User Parameter: ${param["user"]}<br/>
Accept Header: ${header["Accept"]}<br/>
Session ID Cookie Value: ${cookie["JSESSIONID"].value}<br/>
<a href="../index.html">Back</a>

</body>
</html>
