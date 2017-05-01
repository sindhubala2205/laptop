<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserTable</title>
</head>
<body>




	<div class="container">
		<div class="jumbotron">
			<table class="table table-bordered">

				<tbody>
					<tr>
						<th>FirstName</th>
						<th>${fname}</th>
					</tr>
					<tr>
						<th>LastName</th>
						<th>${lname}</th>
					</tr>
					<tr>
						<th>UserName</th>
						<th>${username}</th>
					</tr>
					<tr>
						<th>Email</th>
						<th>${email}</th>
					</tr>
					<tr>
						<th>Mobile</th>
						<th>${mobile}</th>
					</tr>
					<tr>
						<th>Address</th>
						<th>${address}</th>
					</tr>
				</tbody>
			</table>



		</div>
	</div>




</body>
</html>