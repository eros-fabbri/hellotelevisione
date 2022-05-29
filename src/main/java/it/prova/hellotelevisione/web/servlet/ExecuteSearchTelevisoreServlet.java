package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.service.MyServiceFactory;

@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String destinazione = null;

		String marcaInput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");

		if (marcaInput == "" && modelloInput == "") {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare almeno un campo.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "searchForm.jsp";
		} else {
			request.setAttribute("listaTelevisori",
					MyServiceFactory.getTelevisoreService().cercaPerMarcaEModello(marcaInput, modelloInput));
			destinazione = "results.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);

	}

}
