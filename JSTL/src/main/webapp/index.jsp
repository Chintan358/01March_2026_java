<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="a" value="10"></c:set>
		<c:out value="${a}"></c:out>
		
		<c:forEach begin="1" end="10" var="dt">
		<c:out value="${dt}"></c:out>
		</c:forEach>
		
		<c:if test="${a<20}">
		${a }
		</c:if>
		
</body>
</html>