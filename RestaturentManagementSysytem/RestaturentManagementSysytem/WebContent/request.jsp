<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Request Items</title>
<style>
table {
	border-collapse: collapse;
	width: 50%;
}

th, td {
	border: 1px solid black;
	padding: 10px;
	text-align: left;
}

input {
	width: 50px;
}
</style>

<script type="text/javascript">
	function requestFunc() {

		alert("Order send successfully");
		document.mypage.action = "order"
		document.mypage.order();
	}
	</script>
</head>
<body>
	<h2>Request Items</h2>
	<form  name="mypage">
		<h4>
			<input type="date" name="datef"><br>
			<br>
		</h4>

		<table>
			<tr>
				<th>Item</th>
				<th>Quantity(in kg)</th>
			</tr>
			<tr>
				<td>Pohe Masala</td>
				<td><input type="number" name="poheMasala"></td>

			</tr>
			<tr>
				<td>Vadapav Masala</td>
				<td><input type="number" name="vadapavMasala"></td>
			</tr>

			<tr>
				<td>Pulav Masala</td>
				<td><input type="number" name="pulavMasala"></td>
			</tr>

			<tr>
				<td>Samosa Masala</td>
				<td><input type="number" name="samosaMasala"></td>
			</tr>

			<tr>
				<td>Misal Masala</td>
				<td><input type="number" name="misalpavMasala"></td>
			</tr>

			<tr>
				<td>PuriBhaji Masala</td>
				<td><input type="number" name="puribhajiMasala"></td>
			</tr>

			<tr>
				<td>Sweet Chatni</td>
				<td><input type="number" name="sweetChatni"></td>
			</tr>
		</table>
		<br> 
<!-- 		<input type="submit" value="Order"><br>
 -->				<button onclick=requestFunc() value="order">Order</button><br>
		
		<br>
		<button onclick="history.back();">Back</button>

	</form>
</body>
</html>