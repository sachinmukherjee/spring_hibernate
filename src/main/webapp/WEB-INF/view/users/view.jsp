<!DOCTYPE div PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>View</title>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.0.3.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
 <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/users/">Users</a></li>
    <li class="breadcrumb-item active" aria-current="page">View</li>
  </ol>
</nav>
<div class="container">
	<div class="py-3  mx-auto">
		<i class="d-block mx-auto mb-4"></i>
		<h2>User Form</h2>
		<p class="lead">
			View User Details
		</p>
	</div>
	<div class="row">
		<div class="col-md-8">
			<div class="row">
				<div class="col-md-4">
					<label>Username</label>
				</div>
				<div class="col-md-4">
					${user.username}
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<label>Userfullame</label>
				</div>
				<div class="col-md-4">
					${user.userfullname}
				</div>
			</div>
		</div>
		<div class="col-md-8">
			<div class="row">
				<div class="col-md-4">
					<label>Company</label>
				</div>
				<div class="col-md-4">
					${user.owner_company.name}
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<label>Office</label>
				</div>
				<div class="col-md-4">
					${user.ownerCompanyOffices.name}
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>