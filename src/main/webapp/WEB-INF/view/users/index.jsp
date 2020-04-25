<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.0.3.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
 <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav aria-label="breadcrumb">
  		<ol class="breadcrumb">
    		<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    		<li class="breadcrumb-item" aria-current="page">Users</li>
    	</ol>
	</nav>
<div id="wrapper">
	<div id="header col-md-12">
		<h2 style="display: inline-block;">List of Users</h2>
		<a href="${pageContext.request.contextPath}/users/add/" class="btn btn-success float-right">Add</a>
	</div>
	<div id="container">
		
		<div id="content">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Username</th>
						<th>Userfullname</th>
						<th>Action</th>
					</tr>
				</thead>	
				<tbody>
					<c:forEach var="user" items="${users}">
						<tr>
							<td>${user.id}</td>
							<td>${user.username}</td>
							<td>${user.userfullname}</td>
							<td>
								<a href="${pageContext.request.contextPath}/users/edit/${user.id}">Edit</a>
								<a href="${pageContext.request.contextPath}/users/view/${user.id}">View</a>
								<a href="${pageContext.request.contextPath}/users/delete/${user.id}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>