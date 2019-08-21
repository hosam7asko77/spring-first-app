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
<h3>Favorite language</h3>
Java <form:radiobutton path="favoriteLanguag" value="Java"/>
Php <form:radiobutton path="favoriteLanguag" value="Php"/>
C# <form:radiobutton path="favoriteLanguag" value="C#"/>
Python  <form:radiobutton path="favoriteLanguag" value="Python"/>
<br><br>

<h3> OS</h3>
Linux <form:checkbox path="operatingSystem" value="Linux"/>
Windows <form:checkbox path="operatingSystem" value="MS Windows"/>
MAC OS <form:checkbox path="operatingSystem" value="Mac OS"/>


<br><br>
<input type="submit" value="submit">
<br><br>

</form:form>

</body>
</html>