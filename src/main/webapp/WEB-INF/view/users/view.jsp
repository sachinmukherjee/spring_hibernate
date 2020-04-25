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
<div class="col-md-12">
	<p>Username: ${user.username}</p>
	<p>Password: ${user.password}</p>
	<p>Userfullname: ${user.userfullname}</p>
</div>
</body>
</html>