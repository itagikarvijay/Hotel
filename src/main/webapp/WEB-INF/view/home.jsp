<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Home&nbsp;

<a href="/all">All User's</a>
<c:forEach var="user" items="${listUser}">
            <li>${user.username}</li>
        </c:forEach>
${accessNotAllowed}
<br><br><br><br><br><br><br><br>
<a href="/logout">Logout</a>
</body>
</html>