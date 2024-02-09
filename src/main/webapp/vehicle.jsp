<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle and Gas Prices</title>
</head>
<body>
	<h1>Trip Fuel Cost Estimator: Vehicle and Gas</h1>


	<form action="getVehicleGasServlet" method="post">
		<h2>Enter Vehicle Stats Below:</h2>
		<div>
			Enter Vehicle's Fuel Tank Capacity: <input type="text"
				name="tankCapacity" size="20">
		</div>
		<div>
			Enter Vehicle's average Miles Per Gallon: <input type="text"
				name="milesPerGallon" size="20">
		</div>
		<h2>Enter Fuel Stats Below:</h2>
		<div>
			Enter Recent Gasoline Price Per Gallon: <input type="text"
				name="gasPrice" size="10">
		</div>
		<input type="hidden" name="startPoint" value="${userTripEntries.getStartPoint()}"> 
		<input type="hidden" name="endPoint" value="${userTripEntries.getEndPoint()}"> 
		<input type="hidden" name="totalMiles" value="${userTripEntries.getTripDistance()}"> 
		<input type="submit" value="Next" />
	</form>
	<p>
		<a href="index.jsp">Click Here</a> to start over
	</p>
</body>
</html>