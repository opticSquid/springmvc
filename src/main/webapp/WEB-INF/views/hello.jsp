<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
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
	<h1>Hello World 2!</h1>
</body>
</html>
