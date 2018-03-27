<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.myError{color:red}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="page" modelAttribute="customer">

	Nom:<form:input path="nom" />
		<form:errors path="nom" cssClass="myError"></form:errors>
		<br>
	Prenom:<form:input path="prenom" />
		<br>
	Age:<form:input path="age" />
		<form:errors path="age" cssClass="myError"></form:errors>
		<br>
		<form:button type="submit" value="submit">Submit</form:button>
	</form:form>

</body>
</html>