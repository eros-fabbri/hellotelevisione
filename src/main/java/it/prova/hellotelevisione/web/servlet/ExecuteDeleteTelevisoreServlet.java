package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.dao.DB_Mock;
import it.prova.hellotelevisione.service.MyServiceFactory;


@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idTelevisoreDaRimuovere = Integer.parseInt(request.getParameter("idAbitanteDaEliminare"));

		DB_Mock.LISTA_TELEVISORI.removeIf(obj -> obj.getIdTelevisore() == idTelevisoreDaRimuovere);

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");

		try {
			request.setAttribute("listaTelevisori",
					MyServiceFactory.getTelevisoreService().listaTelevisori());
		} catch (Exception e) {
			e.printStackTrace();
		}
		rd.forward(request, response);
	}

}
