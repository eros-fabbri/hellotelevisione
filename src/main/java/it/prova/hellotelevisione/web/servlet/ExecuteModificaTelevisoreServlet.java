package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.dao.DB_Mock;
import it.prova.hellotelevisione.model.Televisore;
import it.prova.hellotelevisione.service.MyServiceFactory;

@WebServlet("/ExecuteModificaTelevisoreServlet")
public class ExecuteModificaTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Long idTelevisoreDaModificareInput = Long.parseLong(request.getParameter("idTelevisoreDaModificareinput"));
		String marcaInput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");
		int polliciInput = Integer.parseInt(request.getParameter("polliciInput"));
		String codiceInput = request.getParameter("codiceInput");
		int prezzoInput = Integer.parseInt(request.getParameter("prezzoInput"));

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore() == idTelevisoreDaModificareInput) {
				televisoreItem.setMarca(marcaInput);
				televisoreItem.setModello(modelloInput);
				televisoreItem.setNumeroPollici(polliciInput);
				televisoreItem.setCodice(codiceInput);
				televisoreItem.setPrezzo(prezzoInput);
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");

		try {
			request.setAttribute("listAbitantiAttributeName",
					MyServiceFactory.getTelevisoreService().listaTelevisori());
		} catch (Exception e) {
			e.printStackTrace();
		}
		rd.forward(request, response);
	}

}
