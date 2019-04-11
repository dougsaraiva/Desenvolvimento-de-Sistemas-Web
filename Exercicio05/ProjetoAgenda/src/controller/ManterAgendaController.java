package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agenda;
import service.AgendaService;

/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/Agenda")
public class ManterAgendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aNome = request.getParameter("nome");
		String aEmail = request.getParameter("email");
		String aTelefone = request.getParameter("telefone");
		String aEndereco = request.getParameter("endereco");
		
		
		//instanciar o javabean
		Agenda agenda = new Agenda();
		agenda.setNome(aNome);
		agenda.setEmail(aEmail);
		agenda.setTelefone(aTelefone);
		agenda.setEndereco(aEndereco);
		
		
		//instanciar o service
		AgendaService as = new AgendaService();
		as.criar(agenda);
		request.setAttribute("agenda", agenda);
		RequestDispatcher view = request.getRequestDispatcher("Agenda.jsp");
		view.forward(request, response);
		
	}

}
