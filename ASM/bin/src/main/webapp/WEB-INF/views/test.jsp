<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
		<h1>dsadas</h1>
		<c:forEach items="${product}" var="ca" >
		
			<h1>${ca.id}</h1>
			<h1>${ca.name}</h1>
		 <img alt="" src="${ca.image}"> 
			
			
		</c:forEach>
		
</body>
</html>