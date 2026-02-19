<%@page import="com.entity.DailyIncome"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Income Details</title>
<style>
/* body {
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
} */
</style>
</head>
<body>

	<h1>Income Details</h1>




	<form action="iDetails">

		<%
			List<DailyIncome> di = (List<DailyIncome>) request.getAttribute("msg");
		%>


		<table border="2" style="color: green;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Date</th>
					<th>Income</th>
					<th>Partner id</th>




				</tr>
			</thead>

			<tbody>
				<%
					for (DailyIncome d : di) {
				%>
				<tr>

					<td><%=d.getTid()%></td>
					<td><%=d.getDatef()%></td>
					<td><%=d.getTodaysIncome()%></td>
					<td><%=d.getPid()%></td>
					<%
						}
					%>

				</tr>

			</tbody>
		</table>
		<br> <br>


	</form>
	<button onclick="history.back();">Back</button>

</body>
</html>