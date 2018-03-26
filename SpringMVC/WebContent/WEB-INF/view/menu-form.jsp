<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- get les attributs grace au modelAttribute -->
	<form:form action="salut" modelAttribute="myStudent">
		<!-- 	get les input -->
		<!-- 	<form action="salut" method="GET" > -->

		<form:input path="prenom" />
		<form:input path="nom" />
		<!-- 		premiere solution -->
		<!-- 		<select name="pays"> -->
		<!-- 		<option>ENG</option> -->
		<!-- 		<option>FRA</option> -->
		<!-- 		<option>CA</option> -->
		<!-- 		</select> -->

		<form:select path="pays">
			<form:options items="${myStudent.paysList}"></form:options>
		</form:select>
		<!-- 		CheckBoxes avec list de choix et choix final -->
		<form:checkboxes items="${myStudent.langageProg}" path="favProg" />
		<!-- 		RadioBUttons Pareil -->
		<form:radiobuttons path="favSysteme"
			items="${myStudent.systemeExploitation}" />
		<form:button type="submit" value="submit">Submit</form:button>
		<br>
	</form:form>
</body>
</html>
