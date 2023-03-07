<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<a href="home">Home</a><br><br>
<form action="checkUser" method="post">

User Name : <input type="text" name="uname"><br><br>
Password : <input type = "text" name="passwd"><br><br>

<input type="submit" value ="Send"><br><br>
</form>
<form action="users">
<input type="submit" value ="ListUsers">
</form>

</body>
</html>