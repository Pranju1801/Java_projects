<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item Selection</title>
<style>
table {
	width: 50%;
	border-collapse: collapse;
	margin: 20px 0;
}

td, th {
	border: 1px solid black;
	padding: 10px;
	text-align: center;
}

.item-btn {
	width: 70px;
	height: 40px;
	cursor: pointer;
}

.total-container {
	margin-top: 20px;
}

.login-container button {
	width: 20%;
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
<script>
        function calculateTotal() {
            let total = 0;
            let rows = document.getElementsByClassName("item-row");
            for (let i = 0; i < rows.length; i++) {
                let price = parseFloat(rows[i].getElementsByClassName("price")[0].value) || 0;
                let quantity = parseInt(rows[i].getElementsByClassName("quantity")[0].value) || 0;
                let subtotal = price * quantity;
                rows[i].getElementsByClassName("total")[0].value = subtotal.toFixed(2);
                total += subtotal;
            }
            document.getElementById("grandTotal").value = total.toFixed(2);
        }
    </script>
</head>
<body>

	<h2>Select Items</h2>
	<table>
		<tr>
			<td><button class="item-btn" onclick="addItem('Pohe')">Pohe</button></td>
			<td><button class="item-btn" onclick="addItem('Vadapav')">Vadapav</button></td>
			<td><button class="item-btn" onclick="addItem('Idli')">Idli</button></td>
		</tr>
		<tr>
			<td><button class="item-btn" onclick="addItem('Tea')">Tea</button></td>
			<td><button class="item-btn" onclick="addItem('Misal Pav')">Misal
					Pav</button></td>
			<td><button class="item-btn" onclick="addItem('Samosa')">Samosa</button></td>
		</tr>
		<tr>
			<td><button class="item-btn" onclick="addItem('Patis')">Patis</button></td>
			<td><button class="item-btn" onclick="addItem('Udid vada')">Udid
					vada</button></td>
			<td><button class="item-btn" onclick="addItem('Bhaje')">Bhaje</button></td>
		</tr>
	</table>
	<h1>Shree Siddhivinayak Vadapav Center</h1>
	<h3>Selected Items</h3>
	<table>
		<tr>
			<th>Item</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total</th>
		</tr>
		<tbody id="itemList"></tbody>
	</table>

	<div class="total-container">
		<label>Total:</label> <input type="text" id="grandTotal" readonly>
		
	</div>


	<script>
        function addItem(itemName) {
            let table = document.getElementById("itemList");
            let row = document.createElement("tr");
           
            row.classList.add("item-row");

            row.innerHTML =`
             
                <td>${itemName}</td>
                <td><input type="number" class="price" value="0" oninput="calculateTotal()"></td>
                <td><input type="number" class="quantity" value="1" oninput="calculateTotal()"></td>
                <td><input type="text" class="total" readonly></td>
            `;

            table.appendChild(row);
        }
    </script>
	<div class="login-container">
		<br>
		<br>
<!-- 		<button type="submit">Print</button>
 -->		  <button onclick="window.print()">Print</button><br><br>
             <button onclick="history.back();">Back</button>
 
		
	</div>
</body>
</html>