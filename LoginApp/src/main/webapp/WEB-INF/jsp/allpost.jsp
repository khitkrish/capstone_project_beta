<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file="common/header.jspf"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>
<c:forEach items="${requirementlist}" var="requirementBean">

		<div class="col-md-7 col-md-offset-3">

			<div class="form-group col-md-9">
                	<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading"> <h3>${requirementBean.donatename} until ${requirementBean.date}</h3>
					
					
					</div>
					<div class="panel-body">
					<ul>
			<li >Donation Id    :    ${requirementBean.reid}</li>
			<li>Doner ID             :    ${requirementBean.id}</li>
			<li>Doner Name             :    ${requirementBean.name}</li>
			<li>Email  :    ${requirementBean.email}</li>
			<li>Phone Number          :    ${requirementBean.phone} </li>
						<li>Quantity      :    ${requirementBean.donatenum} </li>
			
			<li>Pick Up Address  :    ${requirementBean.adress} </li>
						</ul>	
		         <h4 align="center">Register  to reserve this Item</h4>	
		         <h5 align="center">Login if you are already a User </h5>	
		          
		<div align="right">
		
			<a type="button" href="/register" class="button btn btn-primary">Reserve this Item</a> 
			
			</div>
					</div>
				</div>


			</div>
			

		</div>
	</div>


			</c:forEach>
			
</body>

</html>