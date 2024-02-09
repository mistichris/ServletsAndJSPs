<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trip Details Response</title>
</head>
<body>
	<h1>Trip Details Summary</h1>
	<p>Your trip starts at <b>${userTripEntries.getStartPoint()}</b> and
		concludes at <b>${userTripEntries.getEndPoint()}</b>.</p>

	<p>The total trip miles entered was
		<b>${userTripEntries.getTripDistance()} miles</b>.</p>
	<p>Click 'Next' to enter in vehicle and gas prices</p>
	<form action="getVehiclePageServlet" method="post">
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