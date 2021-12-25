<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Item</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br>
<div style="margin-left: 30px">
    <h3>Update the item! </h3><br><br>
    <form action="updateitem" method="post">
        <input type="hidden" name="itemid" value="${item.itemID}">
        Item Name: <input type="text" name="itemname" value="${item.itemName}"><br><br>
        Item price <input type="number" name="price" value="${item.price}"><br><br>
        <input type="submit" class="btn btn-success" style="margin-left: 120px" value="Update Item">
    </form>
</div>


</body>
</html>