<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h3>JSP Expression Language Demo- input</h3>
<hr>
<form name="employeeForm" action="../EmployeeServlet"
      method="GET">
    <p> Please enter the followings information</p>
    <label>Employee ID:</label>
    <input type="text" name="employeeID"/>
    <br/>

    <label>Last Name:</label>
    <input type="text" name="lastName"/>
    <br/>

    <label>Hourly Rate:</label>
    <input type="text" name="hourlyRate"/>
    <br/>

    <label>Hourly Worked:</label>
    <input type="text" name="hourlyWorked"/>

    <br/>

    <input type="submit" name="submit" value="Go"/>
</form>
<a href="../index.html">Back</a>
</body>
</html>
