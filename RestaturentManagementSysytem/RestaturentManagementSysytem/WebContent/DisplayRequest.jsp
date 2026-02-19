<%@page import="com.entity.request"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Item Details</title>
<style>
</style>
</head>
<body>
	<h1>Request Details</h1>
	<br>
	<br>
	<form action="orderDis">

		<%
			List<request> req = (List<request>) request.getAttribute("msg");
		%>


		<table border="2" style="color: green;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Items</th>
					<th>Quantity</th>
					<th>Partner Id</th>
					<th>Date</th>


				</tr>
			</thead>

			<tbody>
				<%
					for (request r : req) {
				%>
				<tr>

					<td><%=r.getId()%></td>


					<td>Pohe Masala</td>
					<td><%=r.getPoheMasala()%></td>
					<td><%=r.getPid()%></td>
			    	<td><%=r.getDatef()%></td>
					
				</tr>

				<tr>
					<td><%=r.getId()%></td>

					<td>Vadapav Masala</td>
					<td><%=r.getVadapavMasala()%></td>

				</tr>
				<tr>
					<td><%=r.getId()%></td>

					<td>Pulav Masala</td>
					<td><%=r.getPulavMasala()%></td>
				</tr>
				<tr>
					<td><%=r.getId()%></td>

					<td>Puri Bhaji Masala</td>
					<td><%=r.getPuribhajiMasala()%></td>
				</tr>
				<tr>
					<td><%=r.getId()%></td>

					<td>Samosa Masala</td>
					<td><%=r.getSamosaMasala()%></td>
				</tr>
				<tr>
					<td><%=r.getId()%></td>

					<td>Sweet Chatni</td>
					<td><%=r.getSweetChatni()%></td>
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