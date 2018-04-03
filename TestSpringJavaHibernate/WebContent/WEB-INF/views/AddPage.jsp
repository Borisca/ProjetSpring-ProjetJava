<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>

	<form:form action="addUser" modelAttribute="personne">


		<form:input path="iD" hidden="true" /><br>
		Nom:<form:input path="nom" /><br>
		Prenom:<form:input path="prenom" /><br>
		Email<form:input path="courriel" /><br>

	<form:button >Valider</form:button>
	</form:form>

</body>
</html>