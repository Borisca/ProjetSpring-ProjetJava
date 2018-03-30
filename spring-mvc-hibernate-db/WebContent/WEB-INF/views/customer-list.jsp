<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<head>
<style>
h2 {
	background: green;
}

body {
	display: flex;
	flex-direction: column;
}

button {
	width: 150px;
}

th {
	width: 500px;
	text-align: center;
	background: green
}

td {
	width: 500px;
	text-align: center
}

tr:nth-child(even) {
	background: grey;
}
</style>
</head>
<body>
	<h2>Ma liste de clients</h2>

	<button type="button" onclick="window.location.href='addCustomer'">Add
		Customer</button>


	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>nom</th>
				<th>prénom</th>
				<th>email</th>
				<th>update/remove</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listCustomers}" var="item">

				<tr>
					<td>${item.id}</td>
					<td>${item.last_name}</td>
					<td>${item.first_name}</td>
					<td>${item.email}</td>

					<td>
						<c:url value="updatePage" var="updatePage">
							<c:param name="identity" value="${item.id}" />
						</c:url> <a href="${updatePage}">update</a> | 
						<c:url value="removePage" var="removePage">
							<c:param name="identity" value="${item.id}" />
						</c:url> <a href="${removePage}">remove</a>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
