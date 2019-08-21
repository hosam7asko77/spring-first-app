<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>student form</title>
</head>
<body>
<h1> The Student form </h1>
<hr>
<br>
<form:form action="processForm" modelAttribute="student">
First Name<form:input path="firstName"/>
<br>
Last Name<form:input path="lastName" />
<br><br>
Country
<form:select path="country">
<form:options items="${student.countryOption}"/>
</form:select>
<br><br>
<input type="submit" value="submit">
</form:form>

</body>
</html>