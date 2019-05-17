<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand"%>
<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl"%>
<%@page
	import="by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%!IBrandDao dao = BrandDBDaoImpl.getInstance();%>
<%
    List<Brand> newEntity = dao.getAll();
    request.setAttribute("listAttr", newEntity);
%>

<html>
<head>
<title>Brands</title>
</head>
<body>

	<%@include file="menu.jsp"%>
	<h1>Brands page</h1>
	<table border="1px solid black" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>ACTIONS</th>
			<th>CREATED</th>
			<th>UPDATED</th>
		</tr>
		<c:forEach items="${listAttr}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td><a href="/brand-edit.jsp?id=${item.id}">edit</a> <a
					href="/servlet/brands?action=delete&id=${item.id}">delete</a></td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/brand-edit.jsp">ADD</a>

</body>
</html>