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
		
			<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/dhurandhar" user="root" password="root" var="dt"/>

			<sql:query var="data" dataSource="${dt}">
			select * from library
			</sql:query>


			<table>
			<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			</tr>
			
			<c:forEach var="dt" items="${data.rows}">
				<tr>
					<td>${dt.id}</td>
					<td>${dt.name}</td>
					<td>${dt.price}</td>
					<td>${dt.qty}</td>
					
				</tr>
			</c:forEach>
			</table>


</body>
</html>