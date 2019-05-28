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
    String id = request.getParameter("id");
    if (id != null && id != "") {
        Car car = dao.get(Integer.valueOf(id));
        request.setAttribute("idValue", car.getId());
        request.setAttribute("nameValue", car.getName());

    }
%>

<html>
<body>
	<%@include file="menu.jsp"%>
	<h1>Cars edit</h1>

	<form action="/servlet/cars" method="post">
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