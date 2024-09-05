<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator App</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/css/style.css">

</head>
<body>
	<h1>Wanna calculate something? Lets go</h1>
	<img src="<%=application.getContextPath() %>/images/logo.gif"><br>
	<form action="runme" method="post">
		<input type="text" name="num1" placeholder="First Number" required="required">
		<input type="text" name="num2" placeholder="Second Number" required="required"><br>
		<button type="submit" name="btn1" value="1" >+</button>
		<button type="submit" name="btn1" value="2">-</button>
		<button type="submit" name="btn1" value="3">*</button>
		<button type="submit" name="btn1" value="4">/</button>
	</form>
</body>
</html>