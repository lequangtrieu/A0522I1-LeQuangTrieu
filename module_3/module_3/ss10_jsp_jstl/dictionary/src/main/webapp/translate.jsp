<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 07/02/2023
  Time: 1:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%
    Map<String,String> dictionary = new HashMap<>();
    dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Quyển vở");
    dictionary.put("computer", "Máy tính");

    String word = request.getParameter("word");
    String result = dictionary.get(word);

    PrintWriter pw = response.getWriter();

    if (result != null) {
        pw.println("<html>");
        pw.println("<h1>Word: "+ word +"</h1>");
        pw.println("<h1>Result: "+ result +"</h1>");
    } else {
        pw.println("Not found");
    }
%>
</body>

<%--<body>--%>
<%--<%!--%>
<%--    Map<String, String> dic = new HashMap<>();--%>
<%--%>--%>

<%--<%--%>
<%--    dic.put("hello", "Xin chào");--%>
<%--    dic.put("how", "Thế nào");--%>
<%--    dic.put("book", "Quyển vở");--%>
<%--    dic.put("computer", "Máy tính");--%>

<%--    String search = request.getParameter("search");--%>

<%--    String result = dic.get(search);--%>
<%--    if (result != null) {--%>
<%--        out.println("Word: " + search);--%>
<%--        out.println("Result: " + result);--%>
<%--    } else {--%>
<%--        out.println("Not found");--%>
<%--    }--%>

<%--%>--%>

<%--</body>--%>
</html>
