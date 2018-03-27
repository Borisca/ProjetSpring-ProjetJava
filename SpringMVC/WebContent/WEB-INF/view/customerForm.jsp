<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>

body
{
background-color: rgb(102,102,204);
}
p
{
text-align:center;
}
h3 {
	color: black;
	position: relative;
	width:500px;
	top: 50px;
	left: 500px;
 	border: 2px green solid; 
	padding: 1em 1.5em 1.5em 1em;
	box-sizing: border-box;
}
.error
{
color:red;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="page" modelAttribute="customer">


		
			<h3>Nom: <br>
		
				<form:input path="nom" />
				<form:errors path="nom" cssClass="error"></form:errors>
			</h3>
		



	
			<h3>Prenom:<br>
			
				<form:input path="prenom" />
				<br>
			</h3>
		


			<h3>Age:<br>
			
				<form:input path="age" type="number" />
				<form:errors path="age" cssClass="error"></form:errors>
			</h3>
			<br>




			<h3>Code Postal:<br>
		<form:input path="postalCode" />
				<form:errors path="postalCode" cssClass="error"></form:errors>
			</h3>

			<br>





			<h3>Promo Code:<br>
			
				<form:input path="promoCode" />
				<form:errors path="promoCode" cssClass="error"></form:errors>
			</h3>
			<br>

		<p>
			<form:button type="submit" value="submit">Submit</form:button>
		</p>
	</form:form>


</body>
</html>