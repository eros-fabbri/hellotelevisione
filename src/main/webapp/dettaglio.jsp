<%@page import="it.prova.hellotelevisione.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio</title>
</head>
<body>
	<%Televisore televisore = (Televisore) request.getAttribute("televisoreDettaglio"); %>
	<h1>DETTAGLIO</h1>
	<h4>Marca: <%= televisore.getMarca()%></h4>
	<h4>Modello: <%= televisore.getModello()%></h4>
	<h4>Pollici: <%= televisore.getNumeroPollici()%></h4>
	<h4>Codice: <%= televisore.getCodice()%></h4>
	<h4>Prezzo: <%= televisore.getPrezzo()%></h4>
	<br>
	<h3><a href="searchForm.jsp">Home</a></h3>

</body>
</html>