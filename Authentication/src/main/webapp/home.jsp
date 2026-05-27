<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<%
		String user = (String) session.getAttribute("user");
		if(user==null)
		{
			request.setAttribute("err", "Please login first");
			request.getRequestDispatcher("index.jsp").forward(request, response);	
		}
%>
			<h1>Hello</h1>
			<a href="logout">Logout</a>
</body>
</html>