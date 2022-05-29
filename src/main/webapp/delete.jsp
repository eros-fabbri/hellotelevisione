<%@page import="it.prova.hellotelevisione.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conferma eliminazione</title>
</head>
<body>
	<%Televisore televisoreDaEliminare = (Televisore)request.getAttribute("televisoreDaRimuovere"); %>
	<h1>ATTENZIONE STO PER ELIMINARE QUESTO TELEVISORE:</h1>
	<h4>Marca: <%= televisoreDaEliminare.getMarca()%></h4>
	<h4>Modello: <%= televisoreDaEliminare.getModello()%></h4>
	<h4>Pollici: <%= televisoreDaEliminare.getNumeroPollici()%></h4>
	<h4>Codice: <%= televisoreDaEliminare.getCodice()%></h4>
	<h4>Prezzo: <%= televisoreDaEliminare.getPrezzo()%></h4>
	<br>
	<form action="ExecuteDeleteTelevisoreServlet" method="post">
		<input type="submit" value="Conferma">
		<input type="hidden" name="idTelevisoreDaEliminare" value="<%= televisoreDaEliminare.getIdTelevisore()%>">
	</form>

</body>
</html>