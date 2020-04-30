<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Owner Company</title>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.0.3.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
 <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav aria-label="breadcrumb">
  		<ol class="breadcrumb">
    		<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    		<li class="breadcrumb-item" aria-current="page">Owner Company</li>
    	</ol>
	</nav>
<div id="wrapper">
	<div id="header col-md-12">
		<h2 style="display: inline-block;">List of Owner Company</h2>
		<a href="${pageContext.request.contextPath}/owner_company/add/" class="btn btn-success float-right">Add</a>
	</div>
	<div id="container">
		<div id="content">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Short Name</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ownerCompany" items="${ownerCompanies}">
						<tr>
							<td>${ownerCompany.id}</td>
							<td>${ownerCompany.name}</td>
							<td>${ownerCompany.short_name}</td>
							<td>
								<a href="${pageContext.request.contextPath}/owner_company/edit/${ownerCompany.id}">Edit</a>
								<a href="${pageContext.request.contextPath}/owner_company/view/${ownerCompany.id}">View</a>
								<a href="${pageContext.request.contextPath}/owner_company/delete/${ownerCompany.id}">Delete</a>
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