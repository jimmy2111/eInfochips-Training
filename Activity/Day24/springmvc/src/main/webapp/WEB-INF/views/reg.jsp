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
<form action="insertMovie" method="post">


Movie Name : <input type = "text" name="moviename"><br><br>
Director : <input type ="text" name ="director"><br><br>
Language: <select name ="language">
<option value="English">English</option>
<option value="Hindi">Hindi</option>
<option value="Other">Other</option>
</select><br><br>

<input type="submit" value ="Add Movie"><br><br>
</form>


</body>
</html>