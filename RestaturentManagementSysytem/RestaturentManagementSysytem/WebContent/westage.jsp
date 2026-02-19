<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            border: 2px solid black;
            padding: 10px;
            text-align: left;
        }
        input {
            width: 50px;
        }
        
    </style>
     <script type="text/javascript">
	function wastageFunc() {

		alert("Westage send successfully");
		document.mypage.action = "westage"
		document.mypage.send();
	}
	</script>
</head>
<body>
    <h2>Wastage(Plate Wise)</h2>
    <form action="westage">
    
                    <h4><input type="date" name="datef"><br><br></h4>
    
        <table>
            <tr>
                <th>Item</th>
                <th>Quantity</th>
                
            </tr>
            <tr>
                <td>
                   Pohe 
                </td>
                <td>
                    <input type="number" name="poheWestage" >
                </td>
            </tr>
            <tr>
                <td>
                     Vadapav
                </td>
                <td>
                    <input type="number" name="vadapavWestage" min="1">
                </td>
            </tr>
            
             <tr>
                <td>
                    Pulav
                </td>
                <td>
                    <input type="number" name="pulavWestage" >
                </td>
            </tr>
            
             <tr>
                <td>
                   Samosa
                </td>
                <td>
                    <input type="number" name="samosaWestage" >
                </td>
            </tr>
            
             <tr>
                <td>
                   MisalPav
                </td>
                <td>
                    <input type="number" name="misalWestage" >
                </td>
            </tr>
            
             <tr>
                <td>
                    PuriBhaji
                </td>
                <td>
                    <input type="number" name="puribhajiWestage" >
                </td>
            </tr>
            
             <tr>
                <td>
                    Idli
                </td>
                <td>
                    <input type="number" name="idliWestage" >
                </td>
            </tr>
        </table>
        <br>
        <button onclick=wastageFunc() value="send">Send</button><br><br>
        
                    <button onclick="history.back();">Back</button>
        
        
    </form>
</body>
</html>