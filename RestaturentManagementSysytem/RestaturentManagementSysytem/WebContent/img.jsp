<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
        }
        .container {
            width: 400px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px 0px gray;
        }
        .logo {
            width: 100px;
            border-radius: 50%;
        }
        .btn {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            background-color: brown;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover {
            background-color: darkred;
        }
        a {
            text-decoration: none;
            color: brown;
        }
    </style>
</head>
<body>
    <div class="container">
        <img src="C:/Users/Pranjali/Pictures/Acer/Acer_Wallpaper_01_3840x2400.jpg" alt="Logo" class="logo">
        <h2>SSV</h2>
        <button class="btn">Admin Login</button>
        <br>
        <a href="adminLogin.jsp">Admin login</a>
        <br><br>
        <button class="btn">Partner Login</button>
        <br>
        <input type="checkbox" id="remember">
        <label for="remember">Remember me</label>
    </div>
</body>
</html>
