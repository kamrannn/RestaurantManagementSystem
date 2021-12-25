<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add items</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br>
<h3>Enter the following details to add an item ! </h3><br><br>

<div style="margin-left: 30px">
    <form action="insertitem" method="post">
        Item Name: <input type="text" name="iname"><br><br>
        Price: <input type="number" name="price"><br><br>
        Spice level: <select name="spice">
        <option value="Spicy"> Spicy</option>
        <option value="Medium"> Medium</option>
        <option value="Mild"> Mild</option>
    </select><br><br>
        <input type="submit" class="btn btn-success" style="margin-left: 120px" value="Add Item">
    </form>
</div>

</body>
</html>