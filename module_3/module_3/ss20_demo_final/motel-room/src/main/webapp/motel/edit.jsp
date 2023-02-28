<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/22/2023
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<center>
  <h1>Motel Management</h1>
  <h2>
    <a href="motel?action=motel">Back to list</a>
  </h2>
</center>

<div align="center">
  <form action="/motel" method="post">
    <input type="hidden" name="action", value="update">
    <table border="1", cellpadding="5">
      <h2>Edit</h2>
      <br>

      <c:if test="${motel != null}">
        <input type="hidden" name="id" value="<c:out value='${motel.id}' />"/>
      </c:if>

      <tr>
        <th>Name:</th>
        <td>
          <input type="text" name="name" size="45"
                 value="<c:out value='${motel.name}' />"/>
        </td>
      </tr>

      <tr>
        <th>Phone Number:</th>
        <td>
          <input type="text" name="phoneNumber" size="45"
                 value="<c:out value='${motel.phoneNumber}' />"/>
<%--  <input type="text" name="phoneNumber" id="phoneNumber" size="45" pattern="(\+84|0)\d{9,10}" title="Vui lòng nhập đúng +84 hoặc 0xxx" required/>--%>

        </td>
      </tr>

      <tr>
        <th>Date Begin:</th>
        <td>
          <input type="date" name="dateBegin" size="15"
                 value="<c:out value='${motel.dateBegin}' />"/>
        </td>
      </tr>

      <tr>
        <th>Note:</th>
        <td>
          <input type="text" name="note" size="15"
                 value="<c:out value='${motel.note}' />"/>
        </td>
      </tr>

      <tr>
        <th>Id Payment:</th>
        <td>
          <select id="idPayment" name="idPayment">
            <option value="100">- Payment Type -</option>
            <c:forEach var="payment" items="${paymentList}">
<%--              <option value="${payment.id}" ${payment.id == motel.idThanhToan? "selected":""}>${payment.name}</option>--%>
              <option value="${payment.id}" ${payment.id == motel.idPayment ? "selected" : ""}>${payment.name}</option>

            </c:forEach>
          </select>
        </td>
      </tr>

      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Save"/>
        </td>
      </tr>

    </table>
  </form>

</div>

</body>
</html>
