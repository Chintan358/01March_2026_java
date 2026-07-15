<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>

<form action="${pageContext.request.contextPath}/doLogin" method="post">

    Username :
    <input type="text" name="username"/><br><br>

    Password :
    <input type="password" name="password"/><br><br>

    <button type="submit">Login</button>

</form>


<c:if test="${param.error != null}">
    Invalid Username or Password
</c:if>

<c:if test="${param.logout != null}">
    Logout Successful
</c:if>



</body>
</html>