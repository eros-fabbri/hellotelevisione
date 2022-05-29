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

/**
 * Servlet implementation class ExecuteInsertTelevisoreServlet
 */
@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String marcaIput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");
		int polliciInput = Integer.parseInt(request.getParameter("polliciInput"));
		int prezzoInput = Integer.parseInt(request.getParameter("prezzoInput"));
		String codiceInput = request.getParameter("codiceInput");
		
		
		Televisore televisore = new Televisore(marcaIput, modelloInput, prezzoInput, polliciInput, codiceInput);
		

		try {
			MyServiceFactory.getTelevisoreService().inserisciTelevisore(televisore);
			request.setAttribute("listaTelevisori",
					MyServiceFactory.getTelevisoreService().listaTelevisori());

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
