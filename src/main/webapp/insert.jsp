<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci</title>
</head>
<body>
	<form action="ExecuteInsertTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br> 
		<input type="text" name="marcaInput" id="marcaInputId">
		<br> 
		<label for="modelloInputId">MODELLO:</label><br> 
		<input type="text" name="modelloInput" id="modelloInputId"> 
		<br>
		<label for="polliciInputId">POLLICI:</label><br> 
		<input type="text" name="polliciInput" id="polliciInputID"> 
		<br>
		<label for="codiceInputId">CODICE:</label><br> 
		<input type="text" name="codiceInput" id="codiceInputId"> 
		<br>
		<label for="prezzoInputId">PREZZO:</label><br> 
		<input type="text" name="prezzoInput" id="prezzoInputId"> 
		<br>
		<br> 
		<input type="submit" value="INSERISCI">
		<br>
		<h3 class="center-text"><a href="searchForm.jsp">Home</a></h3>
		
	</form>

</body>
</html>