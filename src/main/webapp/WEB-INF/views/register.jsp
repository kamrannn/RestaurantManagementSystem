<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br>
<h3>Kindly fill the form to register ! </h3><br><br>
<div style="margin-left: 30px">
    <form action="insertuser" method="post">
        Name: <input type="text" name="username"><br><br>
        Email: <input type="email" name="useremail"><br><br>
        Password: <input type="text" name="userphone"><br><br>

        <input type="submit" class="btn btn-success" value="Register" style="margin-left: 120px">
    </form>
</div>

</body>
</html>