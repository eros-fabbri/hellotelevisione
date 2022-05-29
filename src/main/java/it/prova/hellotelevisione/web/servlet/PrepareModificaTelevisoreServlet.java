package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.service.MyServiceFactory;

@WebServlet("/PrepareModificaTelevisoreServlet")
public class PrepareModificaTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idTelevisoreDaModificareInput = Long.parseLong(request.getParameter("idDaInviareComeParametro"));

		try {
			request.setAttribute("televisoreDaModificare",
					MyServiceFactory.getTelevisoreService().getSingoloTelevisore(idTelevisoreDaModificareInput));
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("modifica.jsp");
		rd.forward(request, response);

	}

}
