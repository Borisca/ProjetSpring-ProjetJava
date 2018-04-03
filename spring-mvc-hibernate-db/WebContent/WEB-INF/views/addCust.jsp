<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="affichage" modelAttribute="cust">

		<h3>
		Id :
		 <br>
		<form:input path="id" readonly="true"></form:input>
		<br>
		</h3>

		<h3>
			Nom: <br>

			<form:input path="last_name" />

		</h3>


		<h3>
			Prenom:<br>

			<form:input path="first_name" />
			<br>
		</h3>


		<h3>
			eMail:<br>
			<form:input path="email" />
		</h3>

		<br>

		<p>
			<form:button >Submit</form:button>
		</p>
		<input type="button"  onclick="location.href='cancel'" value="cancel" />
	</form:form>

</body>
</html>