<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_all.jsp" />

<!-- start the middle column -->

<section>

<h1>Login Form</h1>
<p>Please enter a username and password to continue.</p>
<form action="LoginController" method="post">
    <label>Username</label>
    <input type="text" name="username"><br>
    <label>Password</label>
    <input type="password" name="password"><br>
    <label>&nbsp;</label>
    <input type="submit" value="Login">
</form>

</section>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_news.jsp" />
<jsp:include page="/includes/footer.jsp" />