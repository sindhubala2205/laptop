<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div class="container">
		<div class="jumbotron">
			<div class="table-responsive">
				<table class="table table-striped ">
					<thead>
						<tr>
							<th>ID</th>
							<th>name</th>
							<th>email</th>
						    <th>phone_no</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${userList}" var="user">
							<tr>
								<td>${user.userId}</td>
								<td>${user.name}</td>
								
								<td>${user.email}</td>
								<td>${user.phone_no}</td>
								
								<td><a href="<c:url value='details/${user.userId}' />"
									role="button" class="btn btn-primary">Details</a></td>
								<td><a href="<c:url value='edit/${user.userId}' />"
									role="button" class="btn btn-success">Edit</a></td>
								<td><a href="<c:url value='delete/${user.userId}' />"
									role="button" class="btn btn-danger">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>


</body>
</html>