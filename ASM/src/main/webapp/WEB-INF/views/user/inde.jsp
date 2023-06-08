<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>Username</th>
                <th>Activated</th>
                <th>Admin</th>
                <th>Email</th>
                <th>Fullname</th>
                <th>Photo</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.activated}</td>
                    <td>${user.admin}</td>
                    <td>${user.email}</td>
                    <td>${user.fullname}</td>
                    <td>${user.photo}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
