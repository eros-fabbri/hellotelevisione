package it.prova.hellotelevisione.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisione.service.MyServiceFactory;


/**
 * Servlet implementation class PrepareDeleteTelevisoreServlet
 */
@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idTelevisoreDaRimuovereInput= Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		
		try {
			request.setAttribute("televisoreDaRimuovere",
					MyServiceFactory.getTelevisoreService().getSingoloTelevisore(idTelevisoreDaRimuovereInput));
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);
	}

}
