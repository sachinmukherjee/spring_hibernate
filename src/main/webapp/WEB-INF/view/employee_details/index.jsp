<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.0.3.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
 <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav aria-label="breadcrumb">
  		<ol class="breadcrumb">
    		<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    		<li class="breadcrumb-item" aria-current="page">Employee Details</li>
    	</ol>
	</nav>
<div id="wrapper">
	<div id="header col-md-12">
		<h2 style="display: inline-block;">List of Employees</h2>
		<a href="${pageContext.request.contextPath}/employee_details/add/" class="btn btn-success float-right">Add</a>
	</div>
	<div id="container">
		<div id="content">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Middle Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Mobile No</th>
						<th>Username</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="employee" items="${employees}">
						<tr>
							<td>${employee.id}</td>
							<td>${employee.first_name}</td>
							<td>${employee.middle_name}</td>
							<td>${employee.last_name}</td>
							<td>${employee.email}</td>
							<td>${employee.mobile_no}</td>
							<td>${employee.user.username}</td>
							<td>
								<a href="${pageContext.request.contextPath}/employee_details/edit/${employee.id}">Edit</a>
								<a href="${pageContext.request.contextPath}/employee_details/view/${employee.id}">View</a>
								<a href="${pageContext.request.contextPath}/employee_details/delete/${employee.id}">Delete</a>
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