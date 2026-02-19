<%@page import="com.Entity.Account"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
body {
	display: flex;
	align-items: center;
	justify-content: center;
	min-height: 100vh;
	width: 100%;
	padding: 0 10px;
}

body::before {
	content: "";
	position: absolute;
	width: 300%;
	height: 300%;
	background: url("login-hero-bg.jpg"), #000;
	background-position: center;
	background-size: cover;
}

.wrapper {
	width: 400px;
	border-radius: 8px;
	padding: 30px;
	text-align: center;
	border: 1px solid rgba(255, 255, 255, 0.5);
	backdrop-filter: blur(8px);
	-webkit-backdrop-filter: blur(8px);
}

form {
	display: flex;
	flex-direction: column;
}

h2 {
	font-size: 2rem;
	margin-bottom: 50px;
	color: #fff;
}

.input-field {
	position: relative;
	border-bottom: 2px solid #ccc;
	margin: 30px 0;
}

.input-field label {
	position: absolute;
	top: 50%;
	left: 0;
	transform: translateY(-50%);
	color: #fff;
	font-size: 16px;
	pointer-events: none;
	transition: 0.15s ease;
}

.input-field input {
	width: 100%;
	height: 40px;
	background: transparent;
	border: none;
	outline: none;
	font-size: 16px;
	color: #fff;
}

.input-field input:focus ~label, .input-field input:valid ~label {
	font-size: 0.8rem;
	top: 10px;
	transform: translateY(-120%);
}

.forget {
	display: flex;
	align-items: center;
	justify-content: space-between;
	margin: 25px 0 35px 0;
	color: #fff;
}

#remember {
	accent-color: #fff;
}

.forget label {
	display: flex;
	align-items: center;
}

.forget label p {
	margin-left: 8px;
}

.wrapper a {
	color: #efefef;
	text-decoration: none;
}

.wrapper a:hover {
	text-decoration: underline;
}

button {
	background: #fff;
	color: #000;
	font-weight: 600;
	border: none;
	padding: 12px 20px;
	cursor: pointer;
	border-radius: 3px;
	font-size: 16px;
	border: 2px solid transparent;
	transition: 0.3s ease;
}

button:hover {
	color: #fff;
	border-color: #fff;
	background: rgba(300, 300, 300, 0.20);
}

.register {
	text-align: center;
	margin-top: 50px;
	color: #fff;
}
</style>
<body>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Glassmorphism Login Form | CodingNepal</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="wrapper">
		<%
			Account ac = (Account) request.getAttribute("msg");
		%>
		<form action="up">
			<h2>Update Form</h2>
 		<div class="input-field">
       <input type="text" name="accountNo" value="<%=ac.getAccountNo() %>">
        <label>Enter Account No</label>
      </div>

			<div class="input-field">
				<input type="text" name="name" value="<%=ac.getName()%>"> <label>Name</label>
			</div>
			<div class="input-field">
				<input type="text" name="username" value="<%=ac.getUsername()%>">
				 <label>Enter Username</label>
					
			</div>

			<div class="input-field">
				<input type="text" name="email"  value="<%=ac.getEmail() %>"> 
				<label>Enter Email</label>
			</div>
			<div class="input-field">
				<input type="text" name="contactNO" value="<%=ac.getContactNO()%>"> 
				<label>Enter ContacNO</label>
			</div>
			<div class="input-field">
				<input type="text" name="panNo" value="<%=ac.getPanNo()%>"> 
				<label>Enter PanNo</label>
			</div>
			<div class="input-field">
				<input type="text" name="password" value="<%=ac.getPassword() %>">
				 <label>Enter password</label>
			</div>
			
			<button type="submit">Submit</button>

		</form>
	</div>
</body>
</html>