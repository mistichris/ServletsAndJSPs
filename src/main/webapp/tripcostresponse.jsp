<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trip Final Costs</title>
</head>
<body>
<h1>Trip Details Summary</h1>
<p>Your trip from <b>${userStats.getStartPoint()}</b> and to <b>${userStats.getEndPoint()}</b> totaling <b>${userStats.getTripDistance()} miles</b> . . .</p>
<p>Total gallons of gas needed:  <b>${String.format("%,.2f", userStats.calculateGallonsPerTrip())} gallons</b></p>
<p>Total number of tank fill ups needed: <b>${String.format("%,.2f", userStats.calculateTanksPerTrip())}</b></p>
<p>Total price per tank of gas: <b>${String.format("$%,.2f", userStats.calculatePricePerTank())}</b></p>
<p>Total price of gas for entire trip: <b>${String.format("$%,.2f", userStats.calculateTripFuelCost())}</b></p>
<p></p>
<p></p>

	<p><a href="index.jsp">Click Here</a> to start over</p>
</body>
</html>