<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="common/header.jspf"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>candidate login</title>
</head>
<body>

<nav role="navigation" class="navbar navbar-default">

	<div class="">
		<a  href="/about" class="navbar-brand">Interview scheduler</a>
	</div>

	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="/candidatefront">Home</a></li>
			<li ><a href="/job">Jobs for you </a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/">Logout</a></li>
		</ul>
	</div>

</nav>
<div class="page-header" class="container">
 <h1  >Hi Candidate: ${register.firstname} ${register.lastname}</h1>
 </div>
 <div class="container">  
 <h2>Your Information is here :</h2>
 <div class="container " align="center">
<h3 class="text-muted"> Name     :  ${register.firstname} ${register.lastname}</h3>
 <h3 class="text-muted"> DOB     :   ${register.dob} </h3>
 <h3 class="text-muted"> Gender     :   ${register.gender} </h3>
 <h3 class="text-muted"> Contact Number     :   ${register.num} </h3>
 <h3 class="text-muted"> User     :   ${register.user} </h3>
 <h3 class="text-muted"> ID     :   ${register.id} </h3>
 
</div>
 </div>
  
  
  
    





    
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>