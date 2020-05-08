<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Users</title>
 <jsp:include page="../static.jsp"></jsp:include>
</head>
<body>
	<nav aria-label="breadcrumb">
  		<ol class="breadcrumb">
    		<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    		<li class="breadcrumb-item" aria-current="page">Users</li>
    	</ol>
	</nav>
<div id="container">
	<div id="header col-md-12">
		<h2 class="d-block ml-2">List of Users<span><a href="${pageContext.request.contextPath}/users/add/" class="btn btn-success float-right">Add</a></span></h2>
	</div>
	<form action="${pageContext.request.contextPath}/users/" method="GET">
	
	</form>
	<div class="row">
		<table class="table table-striped ml-3">
			<thead>
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>User Fullname</th>
					<th>Company</th>
					<th>Office</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.id}</td>
						<td>${user.username}</td>
						<td>${user.userfullname}</td>
						<td>${user.owner_company.name}</td>
						<td>${user.ownerCompanyOffices.name} ${user.ownerCompanyOffices.location}</td>
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
	<nav aria-label="Page navigation example" class="pull-right">
	  <ul class="pagination">
	    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
	    <li class="page-item"><a class="page-link" href="#">1</a></li>
	    <li class="page-item"><a class="page-link" href="#">2</a></li>
	    <li class="page-item"><a class="page-link" href="#">3</a></li>
	    <li class="page-item"><a class="page-link" href="#">Next</a></li>
	  </ul>
	</nav>
	
</div>

</body>
</html>