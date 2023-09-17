<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/12/2023
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/student" method="POST">
    <table>
        <tbody>
        <tr>
            <td> Id:</td>
            <td><input type="text" name="id" size="50"/></td>
        </tr>
        <tr>
            <td> Name:</td>
            <td><input type="text" name="name" size="50"/></td>
        </tr>

        <tr>
            <td> Gender:</td>
            <td><select name="gender">
                <option>Male</option>
                <option>Female</option>
            </select></td>
        </tr>
        <tr>
            <td> Date of Birth:</td>
            <td><input type="text" name="dob" placeholder="MM/DD/YYYY" size="15"/></td>
        </tr>
        </tbody>
    </table>
    <input type="reset" value="Clear" name="bntClear"/>
    <input type="submit" value="Submit" name="btnSubmit"/>
</form>

</body>
</html>
