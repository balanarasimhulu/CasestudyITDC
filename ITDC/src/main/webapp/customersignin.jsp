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
<div class="regform"><h1>"Customersignin"</h1></div>
<div class="main">
		<form action="cussignin" class=abc>
	Enter Customer id	<input type="text" name="cid"><br>
	Enter Customer Password<input type="password" name="cpassword"><br>
		<input type="submit" value="signin">
		</form>
		</div>

</body>
</html>