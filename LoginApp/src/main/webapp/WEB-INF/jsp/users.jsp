 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="common/header.jspf"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav role="navigation" class="navbar navbar-default">

	<div class="">
		<a  href="/about" class="navbar-brand">Donate</a>
	</div>

	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
			<li ><a href="/adminfront?id=${registers.id}">Home</a></li>
						<li ><a href="/jobpostings">Donation List</a></li>
						<li class="active"><a href="/users">Users List</a></li>
						
			
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/">Logout</a></li>
		</ul>
	</div>

</nav>
<div class="container">
	<table class="table table-striped">
		<caption>All the Users who are registered here</caption>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Email</th>
				<th>Phone number given</th>
				<th>ID</th>
				<th></th>
				
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requirementlist}" var="registerBean">
				<tr>
					<td>${registerBean.firstname} ${registerBean.lastname}</td>
					<td>${registerBean.email}</td>
					<td>${registerBean.num}</td>
					<td>${registerBean.id}</td>
					
					<td>${registerBean.password}</td>
					
					
					
		
			</tr>
			</c:forEach>
			
				</tbody>
	</table>
	<div>
	</div>
</div>
</body>
</html>


