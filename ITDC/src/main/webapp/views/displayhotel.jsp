<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-color: gray;

}
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
	background-color: gray;
	width: 900px;
	margin: auto;
	}
	form{
	padding: 10px;
	}


</style>
<body>
<div class="regform"><h1>"Hotels"</h1></div>
<div class="main">
		<%! int fontSize; %>
		
		<table border ="5">
			
		
				<tr>
							<td> Hotel ID</td>
							<td> Hotel Name</td>
							<td> Hotel Address</td>
							<td>Total rooms</td>
							<td>Available rooms</td>
							<td>Cost per room</td>
							
							
						
							
				</tr>
				<c:forEach var="l" items="${list}">
				
				<tr>
			
							<td>"${l.hid}"</td>
							<td>"${l.hname}"</td>
							<td>"${l.address}"</td>
							<td>"${l.trooms}"</td>
							<td>"${l.arooms}"</td>
							<td>"${l.cproom}"</td>
							
			
				</tr>	
				</c:forEach>
		
		</table>
		</div>
</body>
</html>