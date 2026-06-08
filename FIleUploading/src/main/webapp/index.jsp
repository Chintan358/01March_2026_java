<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<form action="upload" method="post" enctype="multipart/form-data">
				<input type="text" name="name">
				<input type="file" name="image">
				<input type="submit">
			</form>
			
			<br>
			<hr>
			<br>
			
			
			<table border="">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Image</th>
			</tr>
			
			
		<%-- 	<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
			PreparedStatement ps  =
					cn.prepareStatement("select * from upload");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{ %>
				<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><img src="image/<%=rs.getString(3) %>" alt="<%=rs.getString(3) %>" width="50px" height="50px"></td>
				</tr>
			<%}
			
			%>
			 --%>
			 
			 	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/dhurandhar" user="root" password="root" var="dt"/>

			<sql:query var="data" dataSource="${dt}">
			select * from upload
			</sql:query>
			
			
			<c:forEach var="p" items="${data.rows}">
					
					  <tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td><img src="image/${p.image}" alt="${p.id }" width="50px" height="50px"></td>
				</tr>
					
					</c:forEach>
			
			</table>
			
</body>
</html>