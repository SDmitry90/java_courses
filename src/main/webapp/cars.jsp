<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car"%>
<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl"%>
<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%!ICarDao dao = CarDBDaoImpl.getInstance();%>
<%
    List<Car> newEntity = dao.getAll();
    request.setAttribute("listAttr", newEntity);
%>

<html>
<head>
<title>Cars</title>
</head>
<body>

	<%@include file="menu.jsp"%>
	<h1>Cars page</h1>
	<table border="1px solid black" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>ACTION</th>
			<th>CREATED</th>
			<th>UPDATED</th>
			<th>MODEL_ID</th>
		</tr>
		<c:forEach items="${listAttr}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td><a href="/car-edit.jsp?id=${item.id}">edit</a> <a
					href="/servlet/cars?action=delete&id=${item.id}">delete</a></td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
				<td>${item.model_id}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/car-edit.jsp">ADD</a>

</body>
</html>