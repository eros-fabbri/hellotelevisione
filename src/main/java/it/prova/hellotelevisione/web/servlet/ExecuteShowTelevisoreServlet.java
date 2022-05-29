package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.model.Televisore;
import it.prova.hellotelevisione.service.MyServiceFactory;
import it.prova.hellotelevisione.service.televisore.TelevisoreService;

@WebServlet("/ExecuteShowTelevisoreServlet")
public class ExecuteShowTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idTelevisorePerDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreService();
		
		Televisore  result;
		try {
			result = televisoreServiceInstance
					.getSingoloTelevisore(Long.parseLong(idTelevisorePerDettaglio));
			System.out.println(result);
			request.setAttribute("televisoreDettaglio", result);

			RequestDispatcher rd = request.getRequestDispatcher("dettaglio.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
