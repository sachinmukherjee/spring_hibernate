<div class="col-md-12">
<form action="${pageContext.request.contextPath}/users/submit" method="POST" modelAttribute="user">
	<label>Username</label>
	<input name="username" type="text" value="${user.username}" />
	</br></br>
	<label>Password</label>
	<input name="password" type="password" value="${user.password}"/>
	</br></br>
	<label>Userfullname</label>
	<input name="userfullname" type="text" value="${user.userfullname}"/>
	<input name="id" type="hidden" value="${user.id}"/>
	</br></br>
	<button type="submit">Save</button>
</form>	
</div>