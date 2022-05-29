<%@page import="it.prova.hellotelevisione.model.Televisore"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<style type="text/css">
table, th, td {
	border: 1px solid black;
}

th, td {
	padding: 10px;
}

.center {
	margin-left: auto;
	margin-right: auto;
}

.center-block {
	display: block;
	margin-right: auto;
	margin-left: auto;
	vertical-align: middle;
}

.center-text {
	text-align: center;
}

</style>

<head>
<meta charset="ISO-8859-1">
<title>Risultati</title>
</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azione</th>
			</tr>
		</thead>

		<%
		List<Televisore> listaDaServlet = (List<Televisore>) request.getAttribute("listaTelevisori");
		for (Televisore televisoreItem : listaDaServlet) {
		%>
		<tr>
			<td><%=televisoreItem.getMarca()%></td>
			<td><%=televisoreItem.getModello()%></td>
			<td><a
				href="ExecuteShowTelevisoreServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore()%>">Dettaglio</a>
				<a
				href="PreparaModificaServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore()%>">Modifica</a>
				<a
				href="PrepareDeleteAbitanteServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore()%>">Rimuovi</a>
			</td>
		</tr>
		<%
		}
		%>

	</table>
	<br>
	
	<form  method="post">
		<input formaction="PrepareInsertTelevisoreServlet" type="submit" class="center-block" value="Aggiungi nuovo"> 
	</form>
	
	<h3 class="center-text">
		<a href="searchForm.jsp">Home</a>
	</h3>

</body>
</html>