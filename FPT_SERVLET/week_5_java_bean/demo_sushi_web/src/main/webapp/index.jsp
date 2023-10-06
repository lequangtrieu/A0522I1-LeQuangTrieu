<%@ page import="java.util.List" %>
<%@ page import="entity.Article" %>
<%@ page import="java.util.ArrayList" %><%--
    Document   : home
    Created on : Jun 1, 2020, 11:50:54 AM
    Author     : pc
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <link href="css/container.css" rel="stylesheet" type="text/css"/>
    <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    <link href="css/header.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<jsp:useBean id="article" class="model.ArticleModel" scope="application"></jsp:useBean>
<div class="wrap">
    <%@include file="includes/header.jsp" %>
    <div class="content">
        <div class="main-content">

            <div class="content-left">
                <div class="img-border">
                    <img src="image/19657434_1899909526926678_1129520503603659229_n.jpg" alt=""/>

                </div>

                <c:if test="${not empty noContent}">--%>
                    <h3>${noContent}</h3>
                </c:if>
                <c:if test="${empty noContent}">
                    <c:forEach var="i" items="${content}">


                        <jsp:useBean id="article" class="model.ArticleModel" scope="application"></jsp:useBean>

                        <%
                            List<Article> list = article.getArticlesFromTo(1, 10);
                            for (int i = 0; i < list.size(); i++) {
                                out.print("<div class=border-post>");
                                out.print("<span><a href=" + list.get(i).getTitle()+"></a></span>");
                                out.print("<div class=post>");
                                out.print("<div class=left-post><a><img src=" + list.get(i).getImgLink() + "></a></div>");
                                out.print("<div class=right-post><p>" + list.get(i).getContent() + "</p></div>");
                                out.print("</div>");
                                out.print("</div>");
                            }
                        %>

                    </c:forEach>
                </c:if>
            <%@include file="includes/container.jsp" %>
        </div>
        <%@include file="includes/footer.jsp" %>
    </div>
</div>


<%--<div class="wrap">--%>
<%--    <%@include file="includes/header.jsp" %>--%>
<%--    <div class="content">--%>
<%--        <div class="main-content">--%>

<%--            <div class="content-left">--%>
<%--                <div class="img-border">--%>
<%--                    <img src="image/19657434_1899909526926678_1129520503603659229_n.jpg" alt=""/>--%>

<%--                </div>--%>
<%--                <c:if test="${not empty noContent}">--%>
<%--                    <h3>${noContent}</h3>--%>
<%--                </c:if>--%>
<%--                <c:if test="${empty noContent}">--%>
<%--                    <c:forEach var="i" items="${content}">--%>
<%--                        <div class="border-post">--%>
<%--                            <span><a href="DetailsController?id=${i.getId()}">${i.getTitle()}</a></span>--%>
<%--                            <div class="post">--%>
<%--                                <div class="left-post">--%>
<%--                                    <a href="DetailsController?id=${i.getId()}"><img src="${i.getImgLink()}" alt=""></a>--%>
<%--                                </div>--%>
<%--                                <div class="right-post">--%>
<%--                                    <p>${i.getContent()}</p>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </c:forEach>--%>
<%--                </c:if>--%>
<%--                <div class="paging">--%>
<%--                    <c:forEach var="j" begin="1" step="1" end="${totalPage}">--%>
<%--                        <c:if test="${page != j}">--%>
<%--                            <a href="HomeController?page=${j}" >${j}</a> |--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${page == j}">--%>
<%--                            ${j} |--%>
<%--                        </c:if>--%>
<%--                    </c:forEach>.--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <%@include file="includes/container.jsp" %>--%>
<%--        </div>--%>
<%--        <%@include file="includes/footer.jsp" %>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
</html>
