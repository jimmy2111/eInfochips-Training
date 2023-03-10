<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Movies</title>
</head>
<body>
${movies}<br><br>
<form action="findbylanguage">
Enter Language: <input type ="text" name ="language"><br>
<input type="submit" value="ViewByLanguage"><br><br>

</form>

<a href="findbylanguage?language=English">English</a><br>
<a href="findbylanguage?language=Hindi">Hindi</a><br>
<a href="findbylanguage?language=Other">Others</a><br><br>

<table border="1">
<tr>
<th>Movie Id</th>
<th>Movie Name</th>
<th>Director</th>
<th>Language</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${movies}" var="m">
<tr>
<td>${m.mid}</td>
<td>${m.moviename }</td>
<td>${m.director }</td>
<td>${m.language }</td>
<td><a href="editMovie?mid=${m.mid }">Edit</a></td>
<td><a href="DeleteMovies?mid=${m.mid }">Delete</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>