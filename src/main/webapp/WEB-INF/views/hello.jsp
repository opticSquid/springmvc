<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Hello 2</title>
</head>
<body>
	<%
	Integer id = (Integer) request.getAttribute("id");
	String salary = (String) request.getAttribute("salary");
	out.println("ID: " + id);
	out.println("Salary: " + salary);
	%>
	<!-- This is thing below is called JSP Expression language. For this to work, put isELIgnored="false" in the top most line -->
	<strong>ID: ${id}</strong>
	<strong>Salary: ${salary}</strong>
	<h1>Hello World 2!</h1>
</body>
</html>
