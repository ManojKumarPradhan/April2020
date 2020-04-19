<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table {
	width: 75%;
}

table caption{
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
<title>Students</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to All Student Data Page</h1>
	</div>
	<div align="center">
		<c:choose>
			<c:when test="${!empty datas}">
				<table style="align-content: center; width: 200;">
					<caption>Student Data Table Pagination</caption>
					<tr style="width: 400px">
						<th style="width: 100px; font-size: 5">ID</th>
						<th style="width: 100px; font-size: 5">Name</th>
						<th style="width: 100px; font-size: 5">Course</th>
						<th style="width: 100px; font-size: 5">Age</th>
						<th style="width: 100px; font-size: 5">Edit</th>
						<th style="width: 100px; font-size: 5">Delete</th>
					</tr>
					<c:forEach items="${datas.content }" var="student">
						<tr>
							<td style="width: 100px;"><c:out value="${student.id}"></c:out></td>
							<td style="width: 100px;"><c:out value="${student.name}"></c:out></td>
							<td style="width: 100px;"><c:out value="${student.course}"></c:out></td>
							<td style="width: 100px;"><c:out value="${student.age}"></c:out></td>
							<td style="width: 100px;"><a href="edit?id=${student.id }">EDIT</a>
							</td>
							<td style="width: 100px;"><a href="delete?id=${student.id }">DELETE</a>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="6" align="center"><a href="studnetPage">First</a>&nbsp;&nbsp;&nbsp;
							<c:forEach var="count" begin="1" end="${links }">
								<a href="studnets?pageNo=${count}">${count}</a>&nbsp;&nbsp;&nbsp;
							</c:forEach> <a href="studnets?pageNo=${links}">Last</a></td>
					</tr>
				</table>
			</c:when>
			<c:otherwise>
				<h3>Student Data Not Found</h3>
			</c:otherwise>
		</c:choose>

	</div>
	<div align="center">
		<c:if test="${message ne null }">
			<div>${message}</div>
		</c:if>
	</div>
	<div align="center">
		<h5>
			<a href="home">Home</a>
		</h5>
	</div>
</body>
</html>