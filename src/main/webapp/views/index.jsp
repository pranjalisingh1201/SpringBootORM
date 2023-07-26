<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to the Spring Boot MVC project.<!-- Calls Home Controller -->
	
	<!---<form action="add">
	Calls Add Controller
	Enter num1: <input type="text" name="num1"/><br>
	Enter num2: <input type="text" name="num2"/><br>
	<input type="submit"/>
	</form>-->
	
	<form action="addAlien">
	<!--  Calls Add Controller-->
	Enter Aliens ID: <input type="text" name="aid"/><br>
	Enter Aliens Name: <input type="text" name="aname"/><br>
	<input type="submit"/>
	</form>
</body>
</html>