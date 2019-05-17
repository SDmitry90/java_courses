<%@page import="org.apache.tiles.request.Request"%>
<%@page import="org.eclipse.jetty.jndi.java.javaNameParser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<h1> Hello JSP </h1>
Текущее время: <%=new java.util.Date() %></br>
Current time: <%= request %></br>
<%= request.getParameter("title") %></br>
<%= request.getRemoteHost() %></br>

<%! private int accessCount=0; %>
<%= ++accessCount %></br>	

<% String queryData=request.getQueryString();out.println("Запрос:"+queryData); %>

</head>
<body>

</body>
</html>