<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Partner</title>
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
		<h2>Add Partner</h2>
		<h3>${msg}</h3>

		<form action="addp">
			<input type="number" name="partnerId" placeholder="Partner Id"
				required> <input type="text" name="name"
				placeholder="Partner Name" required> <input type="number"
				name="contactNo" placeholder="Contact No" required> <input
				type="password" name="password" placeholder="Password" required>
			<!--             <input type="number" name="branchId" placeholder="Branch Id" required>
 -->
			<button type="submit">Add</button>
			<br>
			<br>


		</form>
		<button onclick="history.back();">Back</button>

	</div>
</body>
</html>