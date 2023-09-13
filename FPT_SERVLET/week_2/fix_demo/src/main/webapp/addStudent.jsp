<%-- 
    Document   : addStudent
    Created on : 12-09-2023, 14:04:12
    Author     : datqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <h1>Add New Student to System</h1>
            <br><br>
            <form action="StudentServlet" method="POST">
                <label>Student ID</label><input type="text" name="id"/><br>
                <label>Student Name</label><input type="text" name="name"/><br>
                <label>Student gender</label><input type="radio" name="gender" value="M"/>Male<input type="radio" name="gender" value="F"/>Female<br>
                <label>Student DOB</label><input type="date" name="dob"/><br>
                <input type="submit" value="Add" />
            </form>
        </section>
    </body>
</html>
