<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Trip Details</title>
</head>
<body>
	<h1>Trip Fuel Cost Estimator</h1>

	<h2>Enter Trip Details Below:</h2>
	<form action="getTripDetailsServlet" method="post">
		<div>
			Enter Start City:
			<input type="text" name="startPoint" size="20"> 
		</div>
		<div>
			Enter Destination City: 
			<input type="text" name="endPoint" size="20"> 
		</div>
		<div>
			Enter Total Miles of Trip: 
			<input type="text" name="totalMiles" size="10"> 
		</div>
		<input type="submit" value="Next" />
	</form>

</body>
</html>