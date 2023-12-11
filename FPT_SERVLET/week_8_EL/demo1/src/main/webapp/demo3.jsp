<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/17/2023
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  Integer hitsCount = (Integer) application.getAttribute("hitCounter");
  String userName= "ABC";
  if (hitsCount == null || hitsCount == 0) {
    /* First visit */
    hitsCount = 1;
  } else {
    /* return visit */
    hitsCount += 1;
    userName= "lastest User";
  }
  application.setAttribute("hitCounter", hitsCount);
  application.setAttribute("us", userName);
%>
<center>
  <p>
    Total number of visits: ${hitCounter}
    By user: ${us}
</center>

</body>
</html>
