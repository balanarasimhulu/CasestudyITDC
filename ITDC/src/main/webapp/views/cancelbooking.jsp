<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<style type="text/css">
table,th,td{
border :ipx dotted whilte;
border-collapse: collapse;
padding:20px;
font-size: 20px;
}
th{
background:purple;
padding:30px;
text-transform: uppercase;

}

	*{
	margin=0;
	padding=0;
	
	}
	body{
	background-color: lime;
	margin-top: 40px;
	}
	.regform{
	width: 800px;
	background-color: fuchsia;
	margin: auto;
	color: #FFFFFF;
	
	padding:10px 0px 10px
	text-align=centre;
	border-radius: 15px 15px 0px 0px;
	}
	.main{
	background-color: lime;
	width: 800px;
	margin: auto;
	}
	form{
	padding: 10px;
	}
</style>
<body>
<div class="regform"><h1>"Booking Cancellation"</h1></div>
<div class="main">
<form action="nomoney">

		<%! int fontSize; %>
		
		<table border ="5">
		
		
				<tr>
							<td>Booking id </td>
							<td>Customer id</td>
							<td>Hotel id</td>
							<td>booked rooms</td>
							<td>from date</td>
							<td>To date</td>
							
				</tr>
				<c:forEach var="l" items="${list}">
				
				<tr>
			
							<td>"${l.bid}"</td>
							<td>"${l.cusid}"</td>
							<td>"${l. hotelid}"</td>
							<td>"${l.norooms}"</td>
							<td>"${l.fromdate}"</td>
							<td>"${l.todate}"</td>
				</tr>	
				</c:forEach>
		
		</table>
		<input type="submit" value="cancel">
		</form>
	</div>
</body>
</html>