<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Checkout</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br><br>
<div class="container" style="text-align: center;justify-content: center;align-content: center">
    <h1>Kindly Confirm the order</h1><br>
    <form action="/checkout" method="post">
        <%--        <input type="hidden" name="orderid" value="${order.orderID}">--%>
        Item Name: <input type="text" name="itemName" value="${order.itemName}" readonly><br><br>
        Order date: <input type="date" name="date" value="${order.date}" readonly><br><br>
        <%--        Order time: <input type="time" name="time" value="${order.time}" readonly><br><br>--%>
        Item Price: <input type="number" name="price" value="${order.price}" readonly>
        <hr>
        Enter Number Of Meals you want: <input type="number" name="numOfMeals" value="${order.numOfMeals}">
        <hr>
        <label for="paymentType">Choose payment type:</label>
        <select name="paymentType" id="paymentType">
            <option value="cash">Cash</option>
            <option value="card">Card</option>
            <option value="online">Online</option>
            <option value="paypal">Paypal</option>
        </select>
        <br><br>
        <input type="submit" class="btn btn-primary" value="Checkout">
    </form>
    <br><br>

    <div class="d-flex flex-row">
        <div class="p-2"><h6>If you want to change the Item, you can go back</h6></div>
        <div class="p-2"><a type="button" class="btn btn-info" href="viewallitems">Items List</a></div>
    </div>

</div>


</body>
</html>