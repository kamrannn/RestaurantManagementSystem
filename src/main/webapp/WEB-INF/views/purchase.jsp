<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Purchase</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<h1>Purchase your items</h1>
<form action="purchaseitem" method="post">
    <!--Items: <select name = "iname">-->
    <c:forEach items="${item}" var="t">
        <option value="${t.itemName}"><c:out value="${t.itemName}"></c:out></option>
    </c:forEach>
    </select><br>
    Payment Type: <select name="paymentType">
    <option value="cash">Cash</option>
    <option value="card">Card</option>
    <option value="online">Online</option>
    <option value="paypal">Paypal</option>
</select><br><br>

    Booking time: <input type="time" name="time"><br><br>

    <input type="date" name="showdate"><br><br>

</form>


<div align="center">
    <h2>User Registration</h2>
    <form:form action="checkout" method="post" modelAttribute="order">
        <form:label path="name">Full name:</form:label>
        <form:input path="name"/><br/>

        <form:label path="email">E-mail:</form:label>
        <form:input path="email"/><br/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/><br/>

        <form:label path="birthday">Birthday (yyyy-mm-dd):</form:label>
        <form:input path="birthday"/><br/>

        <form:label path="gender">Gender:</form:label>
        <form:radiobutton path="gender" value="Male"/>Male
        <form:radiobutton path="gender" value="Female"/>Female<br/>

        <form:label path="profession">Profession:</form:label>
        <form:select path="profession" items="${professionList}"/><br/>

        <form:label path="married">Married?</form:label>
        <form:checkbox path="married"/><br/>

        <form:label path="note">Note:</form:label>
        <form:textarea path="note" cols="25" rows="5"/><br/>

        <form:button>Register</form:button>
    </form:form>
</div>


<body>

</body>
</html>