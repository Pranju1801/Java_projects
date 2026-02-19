<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Login Page</title>
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
		<h2>Admin Login</h2>
		<h2>${msg}</h2>
		<form action="admin">
			<input type="text" name="aUsername" placeholder="Username" required>
			<input type="password" name="aPassword" placeholder="Password"
				required>
			<button type="submit">Login</button>
			<br>
			<br>
            <button onclick="history.back();">Back</button>

		</form>
 
	</div>

</body>
</html>