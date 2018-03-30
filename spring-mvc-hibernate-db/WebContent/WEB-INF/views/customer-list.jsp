<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<head>
<style>
header{
background:rgb(102,102,204);
display:flex;
flex-direction: column;
margin: 5px,0,0,0,
}

h2 {
	box-sizing:border-box;
	border:solid 2px;
	height:70px;
	position:relative;
	top:-22px;
	text-align:center;
	background: green;
}

body {
	background-color:rgb(102,102,204);
	display: flex;
	flex-direction: column;
}

button {
	width: 150px;
	
}

table{

display:flex;
flex-direction:column;
width:70%;
background-color:white;
position:relative;
left:17%;
}

tr{

	display:flex;
	width:100%;

}
thead {
	
  	width:150px
 	text-align: center; 
 	background: green; 
 	
}
tbody{
width:200%;
}
 td { 
	width:150px; 
 	text-align: center  
 } 
 
th{
width:150px;
 }

tr:nth-child(even) {
	background: grey;
}
</style>
</head>
<body>
<header>
	<h2>Ma liste de clients</h2>

	<button type="button" onclick="window.location.href='addCustomer'">Add
		Customer</button>
</header>

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
