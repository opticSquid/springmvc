<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.sb.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for (Employee e : employees) {
		out.println(e.getId());
		out.println(e.getName());
		out.println(e.getSalary());
		out.println("<br/>==============================<br/>");
	}
	%>
</body>
</html>