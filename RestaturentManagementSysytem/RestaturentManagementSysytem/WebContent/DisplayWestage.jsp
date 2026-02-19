<%@page import="com.entity.Westage"%>
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
	<h1>Wastage Details</h1>
	<br>
	<br>
	<form action="orderDis">

		<%
			List<Westage> west = (List<Westage>) request.getAttribute("msg");
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
					for (Westage w : west) {
				%>
				<tr>

					<td><%=w.getId()%></td>


					<td>Pohe</td>
					
					<td><%=w.getPoheWestage()%></td>
					<td><%=w.getPid()%></td>
				     <td><%=w.getDatef()%></td>
					
				</tr>

				<tr>
					<td><%=w.getId()%></td>

					<td>Vadapav</td>
					<td><%=w.getVadapavWestage()%></td>

				</tr>
				<tr>
					<td><%=w.getId()%></td>

					<td>Pulav</td>
					<td><%=w.getPulavWestage()%></td>
				</tr>
				<tr>
					<td><%=w.getId()%></td>

					<td>Puri Bhaji Masala</td>
					<td><%=w.getPuribhajiWestage()%></td>
				</tr>
				<tr>
					<td><%=w.getId()%></td>

					<td>Samosa</td>
					<td><%=w.getSamosaWestage()%></td>
				</tr>
				<tr>
					<td><%=w.getId()%></td>

					<td>Idli</td>
					<td><%=w.getIdliWestage()%></td>
					<td><%=w.getId()%></td>

				</tr>
				<tr>
					<td><%=w.getId()%></td>

					<td>Misal Pav</td>
					<td><%=w.getMisalWestage()%></td>
					<td><%=w.getId()%></td>
					
			
					
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