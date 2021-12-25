<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Order Placed</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br>
<h1 style="color:green;text-align: center">!!!Your order is successfully placed!!!</h1><br>
<div class="panel-body">
    <table class="table table-striped">
        <thead>
        <tr>
            <th width="16.5%">Order ID</th>
            <th width="16.5%">Item Name</th>
            <th width="16.5%">Quantity</th>
            <th width="16.5%">Order Date</th>
            <th width="16.5%">Total Price</th>
            <th width="16.5%">Payment Type</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${order.orderID}</td>
            <td>${order.itemName}</td>
            <td>${order.numOfMeals}</td>
            <td>${order.date}</td>
            <td>${order.total}</td>
            <td>${order.paymentType}</td>
        </tr>
        </tbody>
    </table>
</div>
<div>
    <hr>
    <h3>Want to purchase other items?</h3>
    <a type="button" class="btn btn-warning"
       href="viewallitems">Purchase more items</a>
    <hr>
</div>

</body>
</html>