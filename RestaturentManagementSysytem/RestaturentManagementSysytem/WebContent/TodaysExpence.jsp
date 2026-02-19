<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Todays Expence</title>
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
<body>

	<div class="login-container">
		<h2>Todays Expence</h2>
		<h3>${msg}</h3>
		<form action="tx">
		   <input type="date" name="datef" placeholder="yyyy-mm-dd" required >
			<input type="number" name="kirana" placeholder="Grossary Amount" >
			<input type="number" name="milk" placeholder="Milk Amount" >
			<input type="number" name="pavLadi" placeholder="Pav Ladi Amount">
	        <input type="number" name="khaki" placeholder="Khaki Amount">

			<button type="submit">Submit</button><br><br>
			            <button onclick="history.back();">Back</button>
			
		</form>
	</div>


</body>