<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>

	<button onclick="window.location.href='pageFormulaireUser'">Add</button>



	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NOM</th>
				<th>PRENOM</th>
				<th>EMAIL</th>
			</tr>
		</thead>
		<c:forEach items="${listPersonnes}" var="personne">
			<tbody>
				<tr>
					<td>${personne.iD}</td>
					<td>${personne.nom}</td>
					<td>${personne.prenom}</td>
					<td>${personne.courriel}</td>
					<td><c:url value="updateUser" var="update">
							<c:param name="iD" value="${personne.iD}" />
						</c:url> <a href="${update}">update</a> | 
						
						<c:url value="removeUser"
							var="remove">
							<c:param name="iD" value="${personne.iD}" />
						</c:url> <a href="${remove}">remove</a></td>
				</tr>


			</tbody>
		</c:forEach>

	</table>




</body>
</html>