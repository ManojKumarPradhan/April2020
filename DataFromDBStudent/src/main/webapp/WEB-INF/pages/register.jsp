<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Register Page</title>
<style>
table {
	width: 75%;
}

table caption {
	font-size: 30px;
	font: bold;
	color: green;
}

table td, table th {
	border: 1px solid grey;
	align-content: center;
	align-items: center;
}

table th {
	background: #eee;
	align-items: center;
}

span.selected {
	background: #ccf;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Student Registration Page</h2>
	</div>
	<hr>
	<br>
	<div align="center">
		<form:form action="insert" modelAttribute="student" method="post">
			<table>
				<caption>Student Registration Form</caption>
				<tr>
					<td>Student Name</td>
					<td>:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Student Course</td>
					<td>:</td>
					<td><form:input path="course" /></td>
				</tr>
				<tr>
					<td>Student Age</td>
					<td>:</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="submit"
						value="Register Student"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<br>
	<div align="center">
		<c:if test="${message ne null }">
			<font color="green" size="8"> <c:out value="${message }"></c:out>
			</font>
		</c:if>
	</div>
	<br>
	<div align="center">
		<a href="home">Home</a> | <a href="getAll">Show All Student</a>
	</div>
</body>
</html>