<%@page import="com.entity.MonthlyExpence"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monthly Expense Details</title>
<style>
</style>
</head>
<body>
<h1>Monthly Expense Details</h1>
	<br>
	<br>
	<form action="mExpense">
	
		<%
		List<MonthlyExpence> me = (List<MonthlyExpence>) request.getAttribute("msg");
		%>


		<table border="2" style="color: green;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Start Date of Month</th>
					<th>End Date of Month</th>
					<th>Partner Id</th>
					
					<th>Rent Amount</th>
					<th>Grossary Amount</th>
					<th>Worker Payment Amount</th>
							</tr>
			</thead>

			<tbody>
	<%
					for (MonthlyExpence m : me) {
				%>

				<tr>
					<td><%=m.getId()%></td>
					<td><%=m.getStartDate()%></td>
					<td><%=m.getEndDate()%></td>
					<td><%=m.getPid()%></td>
					<td><%=m.getRent()%></td>
					<td><%=m.getKirana()%></td>
					<td><%=m.getWorkerPayment()%></td>
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