<%@page import="com.entity.Partner"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Partner Details</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-container {
	background: white;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.login-container h2 {
	margin-bottom: 20px;
}

.login-container input {
	width: 95%;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
}
 
.login-container button {
	width: 100%;
	padding: 10px;
	background-color: #FFA500;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.login-container button:hover {
	background-color: #FFA500;
} 
</style>
</head>
<body>

<div class="login-container">

	<form action="sDetails">
				<h1>Partner Details</h1>
		
		<%
		Partner b = (Partner) request.getAttribute("msg");
		%>

	<%if(b!=null){ %>
	
		<table border="2" style="color: green;">
			<thead>
				<tr>
						<br><br><br>
					<th>Partner ID</th>
					<th>Partner Name</th>
					<th>Partner Contact No</th>
					<th>Password</th>




				</tr>
			</thead>

			<tbody>

				<tr>
			
					<td><%=b.getPartnerId()%></td>
					<td><%=b.getName()%></td>
					<td><%=b.getContactNo()%></td>
					<td><%=b.getPassword()%></td><br><br>
        <%}else{%>
        <h4>No Data Found<h4>
        
        <%} %>
				</tr>

			</tbody>
			</table><br><br>
				             <button onclick="history.back();">Back</button>
			
		
</form>
</div>

</body>
</html>