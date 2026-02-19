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
<script type="text/javascript">

function partnerDetails() {
document .mypage.action = "sDetails";
document.mypage.PartnerDetail();
	
}

function incomeDetails() {
document .mypage.action = "iDetails";
document.mypage.IncomeDetails();
	
}

function dailyExpence() {
	document .mypage.action = "dExpense";
	document.mypage.DailyExpence();
		
	}
function monthlyExpence() {
	document .mypage.action = "mExpense";
	document.mypage.MonthlyExpence();
		
	}
function dailyRequest() {
	document .mypage.action = "orderDis";
	document.mypage.MonthlyExpence();
		
	}
function dailyWestage() {
	document .mypage.action = "displayWestage";
	document.mypage.MonthlyExpence();
		
	}

</script>

</head>
<body>
<body>

	<div class="login-container">
		<form name="mypage">
			<h2></h2>
<!-- 			    <button onclick="window.location.href='PartnerDetail.jsp'">Partner Details</button><br><br>
 -->
			<button onclick=partnerDetails() value="PartnerDetail">Partner Details</button><br><br>
	    	<button onclick=incomeDetails() value="IncomeDetails">Income Details</button><br><br>
	      <button onclick=dailyRequest() value="DisplayRequest">Request Details</button><br><br>
         <button onclick=dailyWestage() value="DisplayWestage">Westage Details</button><br><br>
			
		    <button onclick=dailyExpence() value="DailyExpence">Daily Expence Details</button><br><br>
			
		    <button onclick=monthlyExpence() value="MonthlyExpence">Monthly Expence Details</button><br><br>
			


			<!-- <button onclick="window.location.href='IncomeDetails.jsp'">Todays Data</button>
			<br>
			<br>
			<button onclick="window.location.href='DailyExpence.jsp'">Expense Data</button>
			<br>
			<br> 

			<button onclick="window.location.href='MonthlyData.jsp'">Monthly Data</button>
			<br>
			<br>
		 -->
		 			 	<button onclick="history.back();">Back</button>
		 
	</div> 
	</form>
	
</body>