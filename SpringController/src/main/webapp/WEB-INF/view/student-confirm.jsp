<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>student confirm</title>
</head>
<body>
<h1> The Student confirm </h1>
<hr>
<br>
First Name : ${student.firstName}
<br> 
Last Name: ${student.lastName}
<br>
Last Name: ${student.country}
<br>
Last Name: ${student.favoriteLanguag}
<br>
  <h3>Operating System</h3>
  <ul>
  <c:forEach var="temp" items="${student.operatingSystem}">
  <li> ${temp} </li>
  </c:forEach>
  </ul>
</body>
</html>