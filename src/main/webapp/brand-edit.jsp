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
    String id = request.getParameter("id");
    if (id != null && id != "") {
        Brand brand = dao.get(Integer.valueOf(id));
        request.setAttribute("idValue", brand.getId());
        request.setAttribute("nameValue", brand.getName());

    }
%>

<html>
<body>
	<%@include file="menu.jsp"%>
	<h1>Brands edit</h1>

	<form action="/servlet/brands" method="post">
		<input type="hidden" name="id" value="${idValue}" />
		<table cellspacing="0">
			<tr>
				<td>NAME</td>
				<td><input type="text" name="name" value="${nameValue}" /></td>
			</tr>

		</table>
		<input type="submit" value="SAVE">

	</form>
</body>
</html>