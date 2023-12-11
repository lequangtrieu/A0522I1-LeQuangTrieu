<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/5/2023
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../includes/import-head.jsp"/>

<body>
<jsp:include page="../../includes/pre-loader.jsp"/>
<jsp:include page="../../includes/canvas-menu.jsp"/>
<jsp:include page="../../includes/header.jsp"/>

<section class="vh-100" >
    <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
                <div class="row g-0">
                    <div class="col-md-3 col-lg-3 d-none d-md-block">
                    </div>
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">

                            <form method="post" action="/login">

                                <div class="d-flex align-items-center mb-3 pb-1" >
                                    <h1>BI BÉO RESORT</h1>
                                </div>

                                <h2 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your
                                    account</h2>
                                <h4 class="fw-normal mb-3 pb-3 text-danger"><c:out value="${message}"/></h4>
                                <div class="form-outline mb-4">
                                    <input type="text" id="form2Example17"
                                           class="form-control form-control-lg" placeholder="Username" name="username" value="${cookie.email.value}"/>
                                    <label class="form-label" for="form2Example17">Username</label>
                                </div>

                                <div class="form-outline mb-4">
                                    <input type="password" id="form2Example27"
                                           class="form-control form-control-lg" placeholder="Password" name="password" value="${cookie.password.value}"/>
                                    <label class="form-label" for="form2Example27">Password</label>
                                </div>

                                <div class="pt-1 mb-4">
                                    <button class="btn btn-dark btn-lg btn-block" type="submit">Login</button>
                                </div>

                                <p class="mb-5 pb-lg-2" style="color: #393f81;">Don't have an account? <a
                                        href="registerController" style="color: #393f81;">Register here</a></p>
                                <a href="#!" class="small text-muted">Terms of use.</a>
                                <a href="#!" class="small text-muted">Privacy policy</a>
                            </form>

                        </div>
                    </div>
                    <div class="col-md-3 col-lg-3 d-none d-md-block">
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../../includes/footer.jsp"/>
<jsp:include page="../../includes/import-script.jsp"/>
</body>
</html>
