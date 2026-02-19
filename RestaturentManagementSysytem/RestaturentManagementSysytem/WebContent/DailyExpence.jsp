<%@page import="com.entity.TodaysExpence"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Details</title>
<style>
</style>
</head>
<body>
<h1>Daily Expense Details</h1>
	<br>
	<br>
	<form action="dExpense">

		<%
			List<TodaysExpence> ex = (List<TodaysExpence>) request.getAttribute("msg");
		%>


		<table border="2" style="color: green;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Date</th>
					<th>Khaki Amount</th>
					<th>Kirana Amount</th>
					<th>Milk Amount</th>
					<th>Pav Ladi Amount</th>




				</tr>
			</thead>

			<tbody>
<%
					for (TodaysExpence e : ex) {
				%>

				<tr>
					<td><%=e.getId()%></td>
					<td><%=e.getDatef()%></td>
					<td><%=e.getKhaki()%></td>
					<td><%=e.getKirana()%></td>
					<td><%=e.getMilk()%></td>
					<td><%=e.getPavLadi()%></td>
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