<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	*{
	margin=0;
	padding=0;
	
	}
	body{
	background-color: aqua;
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
</head>
<body>
<div class="regform"><h1>"Admin Operations"</h1></div>
<div class="main">
	<a href="addhotel.jsp"><h1>Add hotel</h1></a>
		<a href="displayhotel"><h1>Display Hotels</h1></a>
		<a href="getdailybookings"><h1>Daily Bookings</h1></a>
		<a href="displaycancelbooking"><h1>Cancellation of Bookings</h1></a>
</div>
</body>
</html>