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
	background-color: aqua;
	width: 800px;
	margin: auto;
	}
	form{
	padding: 10px;
	}


</style>

<body>
<div class="regform"><h1>"Hotel Booking"</h1></div>
<div class="main">
		<form action="bookhotel">
	Enter Customer id	<input type="text" name="cusid"><br>
	Enter Hotel id<input type="text" name="hotelid"><br>
	Enter No of rooms to book	<input type="text" name="norooms"><br>
	Enter from date	<input type="date" name="fromdate"><br>
	Enter To date<input type="date" name="todate"><br>
		<input type="submit" value="book">
		</form>
		</div>
</body>
</html>
