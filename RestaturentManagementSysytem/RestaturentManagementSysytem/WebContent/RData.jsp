<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome To SSV</title>
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
            background-color:  #FFA500;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .login-container button:hover {
            background-color:  #FFA500;
        }
    </style>
    </head>
<body>
<div class="login-container">
<h2>Restaurant Data</h2>

   <!--  <a href="request.jsp">1: Send Request</a>
    <br><br>
    <a href="westage.jsp">2: Enter Todays Westage</a>
    <br><br>
    <a href="income.jsp">3: Enter Todays Income</a>
    <br><br>
    <a href="PatnerLogin.jsp">4: Worker Details</a>
    <br><br>
    <a href="Token.jsp">5: Generate Token</a>
    <br><br>
    <a href="PatnerLogin.jsp">6: Enter Todays Expense</a>
    <br><br>
    <a href="Login.jsp">7: Enter Monthly Expense</a>
    <br><br> -->
            
            
          
            <button onclick="window.location.href='request.jsp'">1:Send Request</button><br><br>
       
            <button onclick="window.location.href='westage.jsp'">2: Enter Todays Wastage</button><br><br>
           <button onclick="window.location.href='income.jsp'">3: Enter Todays Income</button><br><br>
           
       
            <button onclick="window.location.href='Token.jsp'">4: Generate Token</button><br><br>
<!--             <button onclick="window.location.href='worker.jsp'">5: Worker Details</button><br><br>
 -->            
           <button onclick="window.location.href='TodaysExpence.jsp'">6: Enter Todays Expense</button><br><br>
            <button onclick="window.location.href='MonthlyData.jsp'">7: Enter Monthly Expense</button><br><br>
            <button onclick="history.back();">Back</button>
            
           
  </div>
       



  
  
</form>

</body>
</html>
    