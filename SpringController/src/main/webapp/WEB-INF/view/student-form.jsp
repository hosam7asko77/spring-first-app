<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<br>
<input type="submit" value="submit">
</form:form>

</body>
</html>