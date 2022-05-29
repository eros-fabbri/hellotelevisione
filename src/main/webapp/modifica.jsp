<%@page import="it.prova.hellotelevisione.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica</title>
</head>
<body>
Inserire dati da ricercare
	<br>
	<%Televisore televisoreDaModificare = (Televisore)request.getAttribute("televisoreDaModificare"); %>
	<form action="ExecuteModificaTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label>
		<br> 
		<input type="text"name="marcaInput" id="marcaInputId" value=<%= televisoreDaModificare.getMarca()%>> 
		<br> 
		<label for="modelloInputId">MODELLO:</label>
		<br> 
		<input type="text" name="modelloInput"id="modelloInputId" value=<%= televisoreDaModificare.getModello()%>> 
		<br>
		<label for="polliciInput">POLLICI:</label>
		<br> 
		<input type="text" name="polliciInput"id="polliciInputId"value=<%= televisoreDaModificare.getNumeroPollici()%>> 
		<br>
		<label for="codiceInput">CODICE:</label>
		<br> 
		<input type="text" name="codiceInput"id="codiceInputId"value=<%= televisoreDaModificare.getCodice()%>> 
		<br>
		<label for="prezzoInputId">PREZZO:</label>
		<br> 
		<input type="text" name="prezzoInput"id="prezzoInputId" value=<%= televisoreDaModificare.getPrezzo()%>> 
		<br>
		<br> 
		<input type="submit" value="CONFERMA MODIFCA">
		<input type="hidden" value=<%= televisoreDaModificare.getIdTelevisore() %> name="idTelevisoreDaModificareinput"> 
	</form>

</body>
</html>