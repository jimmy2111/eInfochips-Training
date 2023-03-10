<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertMovie">
<input type="hidden" name="mid" value="${movies.mid}"><br><br>
Movie Name:<input type="text" name="moviename" value="${movies.moviename}"><br><br>
Movie Director:<input type="text" name="director" value="${movies.director}"><br><br>
Movie Language:<input type="text" name="language" value="${movies.language}"><br><br>
<input type="submit" value="update">

</form>

</body>
</html>