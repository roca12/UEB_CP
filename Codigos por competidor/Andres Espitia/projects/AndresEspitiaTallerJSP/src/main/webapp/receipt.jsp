<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	String article = request.getAttribute("article").toString();;
	String quantity = request.getAttribute("quantity").toString();
	String value = request.getAttribute("value").toString();
	String names = request.getAttribute("names").toString();
	String last_names = request.getAttribute("last_names").toString();
	String type = request.getAttribute("type").toString();
	String number = request.getAttribute("number").toString();
	String date = request.getAttribute("date").toString();
	String ip = request.getAttribute("ip").toString();
%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title>Receipt</title>
</head>
<body>
	<div class="texto">
	<h1 align="center">Recibo:</h1>
		<p>Señor Usuario: <b><%=names%> <%=last_names%></b></h2>
		<p>Su compra fue realizada satisfactoriamente por un valor de <b>$<%=Integer.parseInt(value)*Integer.parseInt(quantity)%></b>. Correspondiente a <b><%=quantity%> <%=article%></b>.</p>
		<br>
		<p>El precio por unidad fue de: <b>$<%=value%></b></p>
		<p>La compra fue realizada con la tarjeta de crédito número: <b>**** **** **** <%=number%></b> de la franquicia <b><%=type%></b>. Fecha de la compra: <b><%=date%></b></p>
		<p>Dirección IP: <b><%=ip%></b></p>
	</div>
</body>
</html>