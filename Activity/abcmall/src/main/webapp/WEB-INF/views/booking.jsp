<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
  java.util.Date now = new java.util.Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Your Ticket</title>
</head>
<body>
<h1>Welcome to Movie Ticket Booking</h1>

<form action="bookticket" method="post">
Mobile Number: <input type = "text" name="mobileNumber" placeholder="Enter your Mobile Number "><br><br>
Movie Name: <select name="movieName">
<option value="Screen 1 : Vash">Screen 1 : Vash</option>
<option value="Screen 2 : RRR">Screen 2 : RRR</option>
<option value="Screen 3 : KGF">Screen 3 : KGF</option>
<option value="Screen 4 : Pushpa">Screen 4 : Pushpa</option>
</select><br><br>
<input type = "date" name = "bookingDate" id="bookingDate" hidden>
Show Date: <input type ="date" name="showDate" id="date"><br><br>
Show Time: <select name="showTime">
<option value="Morning - 10:00">Morning - 10:00</option>
<option value="Afternoon - 14:30">Afternoon - 14:30</option>
<option value="Evening - 18:00">Evening - 18:00</option>
<option value="Night - 22:00">Night - 22:00</option>
</select><br><br>
Ticket type: <br>
<input type="radio" name="seatType" value="Economy Rs.150">Economy Rs.150<br><br>
<input type="radio" name="seatType" value="Platinum Rs.250">Platinum Rs.250<br><br>
Number of Tickets: <input type="number" name="noOfSeats"><br><br>
<input type="submit" name="checkAvailability" value="Check Availability"><br><br>
Payment Type : <select name="paymentType">
<option value="Card">Card</option>
<option value="Cash">Cash</option>
<option value="UPI">UPI</option>
</select><br><br>
<input type="submit" value="Book Now"><br><br>
</form>
<script>
		var today = new Date().toISOString().split('T')[0];
		var futureDate = new Date(new Date().getTime() + (5 * 24 * 60 * 60 * 1000)).toISOString().split('T')[0];
		document.getElementById("bookingDate").value=today;
		document.getElementById("date").setAttribute("min", today);
		document.getElementById("date").setAttribute("max", futureDate);
	</script>
</body>
</html>