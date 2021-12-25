<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div>
    <h1 style="text-align: center">My items</h1><br>
</div>
<div class="panel-body">
    <table class="table table-striped">
        <thead>
        <tr>
            <th width="20%">ID</th>
            <th width="20%">Name</th>
            <th width="20%">Spice</th>
            <th width="20%">Price</th>
            <th width="20%">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${item}" var="t">
            <tr>
                <td>${t.itemID}</td>
                <td>${t.itemName}</td>
                <td>${t.spice}</td>
                <td>${t.price}</td>
                <td><a type="button" class="btn btn-success"
                       href="updateitem?id=${t.itemID}">Update</a>
                    <a type="button" class="btn btn-warning"
                       href="purchaseitem?id=${t.itemID}">Purchase</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<%--<c:forEach items="${item}" var="t">
    <div>
        <c:out value="${t.itemID}"></c:out><br>
        <c:out value="${t.itemName}"></c:out><br>
        <c:out value="${t.spice}"></c:out> <br>
        <c:out value="${t.price }"></c:out><br>
        <a href="updateitem?id=<c:out value="${t.itemID}"></c:out>"> Update </a><br>
        <a href="purchaseitem?id=<c:out value="${t.itemID}"></c:out>"> Purchase </a>
    </div>
</c:forEach>--%>

</body>
</html>