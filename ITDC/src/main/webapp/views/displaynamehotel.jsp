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
	background-color: aqua;
	width: 420px;
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
							
							<td><h1>Hotel Name</h1></td>
							
							
							
						
							
				</tr>
				<c:forEach var="l" items="${list}">
				
				<tr>
			
							
							<td><h1>"${l.hname}"</h1></td>
							
							
			
				</tr>	
				</c:forEach>
		
		</table>
		</div>
</body>
</html>